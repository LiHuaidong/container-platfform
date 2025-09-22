package hdli.auth.mapper;

import hdli.auth.model.po.UserPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(Long id);

    UserPO selectByUsername(@Param("username") String username);

    UserPO selectByEmail(@Param("email") String email);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);
}