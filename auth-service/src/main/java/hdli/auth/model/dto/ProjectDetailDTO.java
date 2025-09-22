package hdli.auth.model.dto;

/**
 * Description: 项目详情
 *
 * @author: hendrix.li
 * @date: 2025/9/22 21:59
 */

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "项目详情DTO")
public class ProjectDetailDTO {
    @Schema(description = "项目ID")
    private Long id;

    @Schema(description = "项目名称")
    private String name;

    @Schema(description = "项目描述")
    private String description;

    @Schema(description = "创建时间")
    private String createTime;

    @Schema(description = "更新时间")
    private String updateTime;
}