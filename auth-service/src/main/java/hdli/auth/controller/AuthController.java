package hdli.auth.controller;

import hdli.auth.model.dto.UserDetailDTO;
import hdli.auth.model.dto.UserLoginDTO;
import hdli.auth.model.dto.UserRegisterDTO;
import hdli.auth.service.impl.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

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
}