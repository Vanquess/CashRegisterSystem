package com.xsx.cash_register_system.service.impl;

import com.xsx.cash_register_system.controller.mapper.UserMapper;
import com.xsx.cash_register_system.entity.User;
import com.xsx.cash_register_system.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author BKGin
 * @Email xushengxing@gmail.com
 * @Date 2021/1/19
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getAllUserByName(String username) {
        return userMapper.getAllUserByName(username);
    }

    @Override
    public User loginPage(String username, String id) {
        return userMapper.loginPage(username, id);
    }
}
