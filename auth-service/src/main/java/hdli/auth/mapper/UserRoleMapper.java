package hdli.auth.mapper;

import hdli.auth.model.po.UserRolePO;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRolePO record);

    int insertSelective(UserRolePO record);

    UserRolePO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRolePO record);

    int updateByPrimaryKey(UserRolePO record);
}