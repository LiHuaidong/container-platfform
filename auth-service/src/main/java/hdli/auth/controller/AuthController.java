package hdli.auth.controller;

import hdli.auth.model.dto.UserDetailDTO;
import hdli.auth.model.dto.UserLoginDTO;
import hdli.auth.model.dto.UserProjectPermissionsDTO;
import hdli.auth.model.dto.UserRegisterDTO;
import hdli.auth.service.impl.AuthService;
import hdli.auth.service.impl.PermissionService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;
    @Autowired
    private PermissionService permissionService;

    @PostMapping("/login")
    public String login(@RequestBody UserLoginDTO user) {
        return authService.login(user);
    }

    @PostMapping("/register")
    public UserDetailDTO register(@RequestBody UserRegisterDTO user) {
        return authService.register(user);
    }

    @PostMapping("/refresh")
    public String refreshToken(@RequestParam String token) {
        return authService.refreshToken(token);
    }

    @PostMapping("/logout")
    public void logout(@RequestParam String token) {
        authService.logout(token);
    }

    @PostMapping("/validate-token")
    public boolean validateToken(@RequestParam String token) {
        Claims claims = authService.validateToken(token);
        return claims != null && !claims.getExpiration().before(new Date());
    }

    @GetMapping("/user-permissions")
    public List<UserProjectPermissionsDTO> getPermissions(@RequestParam Long userId, @RequestParam Long projectId, @RequestParam(name = "roleId", required = false) Long roleId) {
        return permissionService.getPermissions(userId, projectId, roleId);
    }

}