package hdli.auth.service.impl;

import hdli.auth.mapper.UserMapper;
import hdli.auth.model.dto.UserDetailDTO;
import hdli.auth.model.dto.UserLoginDTO;
import hdli.auth.model.dto.UserProjectPermissionsDTO;
import hdli.auth.model.dto.UserRegisterDTO;
import hdli.auth.model.po.UserPO;
import hdli.auth.service.IAuthService;
import hdli.auth.service.IPermissionService;
import hdli.auth.util.JwtUtil;
import io.jsonwebtoken.Claims;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class AuthService implements IAuthService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private IPermissionService permissionService;

    @Resource
    private JwtUtil jwtUtil;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public String login(UserLoginDTO user) {
        UserPO existingUser = userMapper.selectByUsername(user.getUsername());
        if (existingUser == null || !passwordEncoder.matches(user.getPassword(), existingUser.getPasswordHash())) {
            throw new RuntimeException("Invalid username or password");
        }
        String token = jwtUtil.generateToken(existingUser.getUsername());

        List<UserProjectPermissionsDTO> permissions = permissionService.getPermissions(existingUser.getId(), null, null);
        redisTemplate.opsForValue().set(existingUser.getUsername(), permissions, 24, TimeUnit.HOURS);
        return token;
    }

    @Transactional
    @Override
    public UserDetailDTO register(UserRegisterDTO user) {
        if (userMapper.selectByUsername(user.getUsername()) != null) {
            throw new RuntimeException("Username already exists");
        }
        if (userMapper.selectByEmail(user.getEmail()) != null) {
            throw new RuntimeException("Email already exists");
        }
        String encryptedPassword = passwordEncoder.encode(user.getPassword());

        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(user, userPO);
        userPO.setPasswordHash(encryptedPassword);
        userPO.setEnabled(true);
        userMapper.insert(userPO);

        UserDetailDTO userDetailDTO = new UserDetailDTO();
        BeanUtils.copyProperties(userPO, userDetailDTO);
        return userDetailDTO;
    }

    @Override
    public String refreshToken(String token) {
        Claims claims = jwtUtil.validateToken(token);
        if (claims == null || claims.getExpiration().before(new Date())) {
            throw new RuntimeException("Invalid or expired token");
        }
        String username = claims.getSubject();
        UserPO existingUser = userMapper.selectByUsername(username);
        List<UserProjectPermissionsDTO> permissions = permissionService.getPermissions(existingUser.getId(), null, null);
        String newToken = jwtUtil.generateToken(username);
        redisTemplate.opsForValue().set(existingUser.getUsername(), permissions, 24, TimeUnit.HOURS);
        return newToken;
    }

    @Override
    public void logout(String token) {
        Claims claims = jwtUtil.validateToken(token);
        if (claims == null || claims.getExpiration().before(new Date())) {
            throw new RuntimeException("Invalid or expired token");
        }
        String username = claims.getSubject();
        redisTemplate.delete(username);
    }

    @Override
    public Claims validateToken(String token) {
        return jwtUtil.validateToken(token);
    }
}