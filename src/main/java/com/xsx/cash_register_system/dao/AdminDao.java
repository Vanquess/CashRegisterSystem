package com.xsx.cash_register_system.dao;

import java.util.List;

public interface AdminDao {

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    public List selectById (int id, String password);
}
