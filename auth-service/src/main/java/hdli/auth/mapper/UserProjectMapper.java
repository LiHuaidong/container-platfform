package hdli.auth.mapper;

import hdli.auth.model.po.UserProjectPO;

public interface UserProjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserProjectPO record);

    int insertSelective(UserProjectPO record);

    UserProjectPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserProjectPO record);

    int updateByPrimaryKey(UserProjectPO record);
}