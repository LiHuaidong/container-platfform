package hdli.auth.controller;

import hdli.auth.model.dto.UserDetailDTO;
import hdli.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public UserDetailDTO getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

}