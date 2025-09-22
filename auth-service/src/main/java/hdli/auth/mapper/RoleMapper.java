package hdli.auth.mapper;

import hdli.auth.model.po.RolePO;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePO record);

    int insertSelective(RolePO record);

    RolePO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePO record);

    int updateByPrimaryKey(RolePO record);
}