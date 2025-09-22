package hdli.auth.service;

import hdli.auth.model.dto.UserDetailDTO;

/**
 * Description: 用户操作Service
 *
 * @author: hendrix.li
 * @date: 2025/9/22 19:51
 */
public interface IUserService {

    UserDetailDTO getUser(Long id);

    UserDetailDTO getUser(String username);
}
