package hdli.auth.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Description: 用户注册DTO
 *
 * @author: hendrix.li
 * @date: 2025/9/22 20:13
 */
@Data
@ApiModel(value = "用户注册信息", description = "用户注册请求参数")
public class UserRegisterDTO {
    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    @ApiModelProperty(value = "密码", required = true)
    private String password;

    @ApiModelProperty(value = "邮箱")
    @NotBlank(message = "密码不能为空")
    private String email;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "昵称")
    private String nickname;

}
