package hdli.auth.mapper;

import hdli.auth.model.po.PermissionPO;

public interface PermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionPO record);

    int insertSelective(PermissionPO record);

    PermissionPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionPO record);

    int updateByPrimaryKey(PermissionPO record);
}