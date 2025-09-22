package hdli.auth.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * 系统用户表
 */
@ApiModel(description="系统用户表")
public class UserPO {
    /**
    * 用户唯一ID
    */
    @ApiModelProperty(value="用户唯一ID")
    private Long id;

    /**
    * 用户名，唯一
    */
    @ApiModelProperty(value="用户名，唯一")
    private String username;

    /**
    * 邮箱地址
    */
    @ApiModelProperty(value="邮箱地址")
    private String email;

    /**
    * 加密后的密码（如 bcrypt）
    */
    @ApiModelProperty(value="加密后的密码（如 bcrypt）")
    private String passwordHash;

    /**
    * 是否启用该账户
    */
    @ApiModelProperty(value="是否启用该账户")
    private Boolean enabled;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createdAt;

    /**
    * 最后更新时间
    */
    @ApiModelProperty(value="最后更新时间")
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash == null ? null : passwordHash.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}