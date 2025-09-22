package hdli.auth.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * 项目表
 */
@ApiModel(description="项目表")
public class ProjectPO {
    /**
    * 项目ID
    */
    @ApiModelProperty(value="项目ID")
    private Long id;

    /**
    * 项目名称
    */
    @ApiModelProperty(value="项目名称")
    private String name;

    /**
    * 项目描述
    */
    @ApiModelProperty(value="项目描述")
    private String description;

    /**
    * 项目拥有者ID（创建者）
    */
    @ApiModelProperty(value="项目拥有者ID（创建者）")
    private Long ownerId;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createdAt;

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

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}