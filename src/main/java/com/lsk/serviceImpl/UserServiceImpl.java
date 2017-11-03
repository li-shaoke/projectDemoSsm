package com.lsk.serviceImpl;

import com.lsk.dao.UserMapper;
import com.lsk.domain.User;
import com.lsk.domain.UserExample;
import com.lsk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lsk10238 on 2017/10/31.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey((long)id);
    }

    @Override
    public List<User> getUsers(int dataFlag) {
        UserExample userExample= new UserExample();
        UserExample.Criteria criteria= userExample.createCriteria();
        criteria.andDataflagEqualTo(dataFlag);
        return userMapper.selectByExample(userExample);
    }
}
