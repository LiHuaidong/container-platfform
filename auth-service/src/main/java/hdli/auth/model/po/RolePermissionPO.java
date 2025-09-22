package hdli.auth.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 角色与权限关联表
 */
@ApiModel(description="角色与权限关联表")
public class RolePermissionPO {
    /**
    * 主键ID
    */
    @ApiModelProperty(value="主键ID")
    private Long id;

    /**
    * 角色ID
    */
    @ApiModelProperty(value="角色ID")
    private Long roleId;

    /**
    * 权限ID
    */
    @ApiModelProperty(value="权限ID")
    private Long permissionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}