package hdli.auth.service;

import hdli.auth.model.dto.UserDetailDTO;
import hdli.auth.model.dto.UserLoginDTO;
import hdli.auth.model.dto.UserRegisterDTO;

/**
 * Description:
 *
 * @author: hendrix.li
 * @date: 2025/9/22 20:50
 */
public interface IAuthService {
    String login(UserLoginDTO user);

    UserDetailDTO register(UserRegisterDTO user);

    String refreshToken(String token);

    void logout(String token);
}
