package hdli.auth.mapper;


import hdli.auth.model.po.RolePermissionPO;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePermissionPO record);

    int insertSelective(RolePermissionPO record);

    RolePermissionPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermissionPO record);

    int updateByPrimaryKey(RolePermissionPO record);
}