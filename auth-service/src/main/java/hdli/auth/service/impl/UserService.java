package hdli.auth.service.impl;

import hdli.auth.mapper.UserMapper;
import hdli.auth.model.dto.UserDetailDTO;
import hdli.auth.model.po.UserPO;
import hdli.auth.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetailDTO getUser(Long id) {
        UserPO userPO = userMapper.selectByPrimaryKey(id);

        UserDetailDTO userDetailDTO = new UserDetailDTO();
        BeanUtils.copyProperties(userPO, userDetailDTO);
        return userDetailDTO;
    }

    @Override
    public UserDetailDTO getUser(String username) {
        UserPO userPO = userMapper.selectByUsername(username);

        UserDetailDTO userDetailDTO = new UserDetailDTO();
        BeanUtils.copyProperties(userPO, userDetailDTO);
        return userDetailDTO;
    }
}