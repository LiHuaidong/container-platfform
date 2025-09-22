package hdli.auth.service.impl;

import hdli.auth.model.dto.UserProjectPermissionsDTO;
import hdli.auth.service.IPermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService implements IPermissionService {

    @Override
    public List<UserProjectPermissionsDTO> getPermissions(Long userId, Long projectId, Long roleId) {
        // TODO: Implement permission retrieval logic
        return List.of();
    }
}