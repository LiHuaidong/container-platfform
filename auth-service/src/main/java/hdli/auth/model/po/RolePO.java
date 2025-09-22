package hdli.auth.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户角色表
 */
@ApiModel(description="用户角色表")
public class RolePO {
    /**
    * 角色ID
    */
    @ApiModelProperty(value="角色ID")
    private Long id;

    /**
    * 角色名称，如 admin、developer
    */
    @ApiModelProperty(value="角色名称，如 admin、developer")
    private String name;

    /**
    * 角色描述
    */
    @ApiModelProperty(value="角色描述")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}