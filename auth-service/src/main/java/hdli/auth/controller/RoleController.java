package hdli.auth.controller;

import hdli.auth.model.dto.UserProjectRolesDTO;
import hdli.auth.service.impl.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<UserProjectRolesDTO> getRoles(@RequestParam Long userId, @RequestParam Long projectId) {
        return roleService.getRoles(userId, projectId);
    }
}