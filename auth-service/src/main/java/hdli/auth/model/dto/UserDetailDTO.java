package hdli.auth.model.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * 用户详情
 *
 * @author : hendrixli
 * @date : 2025-09-22 19:43
 **/
public class UserDetailDTO {

    /**
     * 用户唯一ID
     */
    @ApiModelProperty(value = "用户唯一ID")
    private Long id;

    /**
     * 用户名，唯一
     */
    @ApiModelProperty(value = "用户名，唯一")
    private String username;

    /**
     * 邮箱地址
     */
    @ApiModelProperty(value = "邮箱地址")
    private String email;

}
