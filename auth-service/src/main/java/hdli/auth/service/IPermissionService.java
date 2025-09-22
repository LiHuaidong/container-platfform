package hdli.auth.service;

import hdli.auth.model.dto.UserProjectPermissionsDTO;

import java.util.List;

/**
 * Description:
 *
 * @author: hendrix.li
 * @date: 2025/9/22 21:57
 */
public interface IPermissionService {
    List<UserProjectPermissionsDTO> getPermissions(Long userId, Long projectId, Long roleId);
}
