package hdli.auth.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * Description: 用户拥有的角色
 *
 * @author: hendrix.li
 * @date: 2025/9/22 21:22
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class UserProjectRolesDTO {
    private Long userId;
    private String username;
    private Long projectId;
    private String projectName;
    private List<UserRole> roles;

    @Data
    @NoArgsConstructor
    @SuperBuilder
    static class UserRole {
        private Long roleId;
        private String roleName;
        private String description;
    }

}
