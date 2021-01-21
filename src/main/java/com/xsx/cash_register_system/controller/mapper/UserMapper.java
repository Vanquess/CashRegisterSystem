package com.xsx.cash_register_system.controller.mapper;

import com.xsx.cash_register_system.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author BKGin
 * @Email xushengxing@gmail.com
 * @Date 2021/1/19
 */
@Repository
public interface UserMapper {
    /**
     * 查询全部
     */
    List<User> getAllUser();

    @Select("select username,id from user where username = #{username}")
    User getAllUserByName(@Param("username") String name);
    /**
     *
     */
    User loginPage(String username,String id);
}
