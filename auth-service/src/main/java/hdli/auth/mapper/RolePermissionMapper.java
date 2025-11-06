package hdli.auth.mapper;


import hdli.auth.model.po.RolePermissionPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolePermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePermissionPO record);

    int insertSelective(RolePermissionPO record);

    RolePermissionPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermissionPO record);

    int updateByPrimaryKey(RolePermissionPO record);
}