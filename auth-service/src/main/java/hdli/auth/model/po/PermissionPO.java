package hdli.auth.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 权限表
 */
@ApiModel(description="权限表")
public class PermissionPO {
    /**
    * 权限ID
    */
    @ApiModelProperty(value="权限ID")
    private Long id;

    /**
    * 权限标识，如 app:deploy
    */
    @ApiModelProperty(value="权限标识，如 app:deploy")
    private String code;

    /**
    * 权限描述
    */
    @ApiModelProperty(value="权限描述")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}