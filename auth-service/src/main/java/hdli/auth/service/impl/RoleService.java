package hdli.auth.service.impl;

import hdli.auth.model.dto.UserProjectRolesDTO;
import hdli.auth.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {

    @Override
    public List<UserProjectRolesDTO> getRoles(Long userId, Long projectId) {
        // TODO: Implement role retrieval logic
        return List.of();
    }
}