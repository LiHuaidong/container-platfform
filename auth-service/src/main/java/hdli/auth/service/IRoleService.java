package hdli.auth.service;

import hdli.auth.model.dto.UserProjectRolesDTO;

import java.util.List;

/**
 * Description:
 *
 * @author: hendrix.li
 * @date: 2025/9/22 21:47
 */
public interface IRoleService {
    List<UserProjectRolesDTO> getRoles(Long userId, Long projectId);
}
