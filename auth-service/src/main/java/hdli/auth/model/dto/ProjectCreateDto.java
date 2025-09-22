package hdli.auth.model.dto;

/**
 * Description: 项目创建DTO
 *
 * @author: hendrix.li
 * @date: 2025/9/22 21:58
 */

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "项目创建DTO")
public class ProjectCreateDto {
    @NotBlank(message = "项目名称不能为空")
    @Size(max = 50, message = "项目名称长度不能超过50个字符")
    @Schema(description = "项目名称", required = true)
    private String name;

    @Size(max = 200, message = "项目描述长度不能超过200个字符")
    @Schema(description = "项目描述")
    private String description;

    @NotNull(message = "项目负责人ID不能为空")
    @Min(value = 1, message = "项目负责人ID必须大于0")
    @Schema(description = "项目负责人ID", required = true)
    private Long ownerId;

}

