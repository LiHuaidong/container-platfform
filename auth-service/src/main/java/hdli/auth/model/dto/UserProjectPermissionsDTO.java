package hdli.auth.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * Description: 用户拥有的权限
 *
 * @author: hendrix.li
 * @date: 2025/9/22 21:22
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class UserProjectPermissionsDTO {
    private Long userId;
    private String username;
    private Long projectId;
    private String projectName;
    private List<UserPermission> permissions;

    @Data
    @NoArgsConstructor
    @SuperBuilder
    static class UserPermission {
        private Long permissionId;
        private String permissionName;
    }

}
