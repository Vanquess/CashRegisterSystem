package com.xsx.cash_register_system.service;

import com.xsx.cash_register_system.entity.User;

import java.util.List;

/**
 * @Author BKGin
 * @Email xushengxing@gmail.com
 * @Date 2021/1/19
 */
public interface UserService {

    List<User> getAllUser();

    User getAllUserByName(String username);

    User loginPage(String username, String id);
}
