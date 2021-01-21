package com.xsx.cash_register_system.dao;

import com.xsx.cash_register_system.entity.Admin;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface AdminDao {

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    Admin findById (Integer id);

}
