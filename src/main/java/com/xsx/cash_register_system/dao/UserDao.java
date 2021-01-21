//package com.xsx.cash_register_system.dao;
//
//import com.xsx.cash_register_system.entity.User;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
///**
// * @Author BKGin
// * @Email xushengxing@gmail.com
// * @Date 2021/1/19
// */
//
////@MapperScan
//@Repository
//public interface UserDao {
//    /**
//     * 查询全部
//     */
//    List<User> getAllUser();
//
//    @Select("select username,id from user where username = #{username}")
//    User getAllUserByName(@Param("username") String name);
//    /**
//     *
//     */
//    User loginPage(String username,String id);
//}
