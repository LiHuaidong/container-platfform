package hdli.auth.service.impl;

import hdli.auth.mapper.UserMapper;
import hdli.auth.model.dto.UserDetailDTO;
import hdli.auth.model.dto.UserLoginDTO;
import hdli.auth.model.dto.UserRegisterDTO;
import hdli.auth.model.po.UserPO;
import hdli.auth.service.IAuthService;
import hdli.auth.util.JwtUtil;
import io.jsonwebtoken.Claims;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class AuthService implements IAuthService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private JwtUtil jwtUtil;
    @Resource
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public String login(UserLoginDTO user) {
        UserPO existingUser = userMapper.selectByUsername(user.getUsername());
        if (existingUser == null || !passwordEncoder.matches(user.getPassword(), existingUser.getPasswordHash())) {
            throw new RuntimeException("Invalid username or password");
        }
        return jwtUtil.generateToken(existingUser.getUsername());
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
        return jwtUtil.generateToken(claims.getSubject());
    }

    @Override
    public void logout(String token) {
        Claims claims = jwtUtil.validateToken(token);
        if (claims == null || claims.getExpiration().before(new Date())) {
            throw new RuntimeException("Invalid or expired token");
        }
    }

    @Override
    public Claims validateToken(String token) {
        return jwtUtil.validateToken(token);
    }
}