package hdli.auth.controller;

import hdli.auth.model.dto.UserProjectPermissionsDTO;
import hdli.auth.service.impl.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping
    public List<UserProjectPermissionsDTO> getPermissions(@RequestParam Long userId, @RequestParam Long projectId, @RequestParam(name = "roleId", required = false) Long roleId) {
        return permissionService.getPermissions(userId, projectId, roleId);
    }
}