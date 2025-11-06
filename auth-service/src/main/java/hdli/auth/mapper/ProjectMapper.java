package hdli.auth.mapper;

import hdli.auth.model.po.ProjectPO;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectPO record);

    int insertSelective(ProjectPO record);

    ProjectPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProjectPO record);

    int updateByPrimaryKey(ProjectPO record);
}