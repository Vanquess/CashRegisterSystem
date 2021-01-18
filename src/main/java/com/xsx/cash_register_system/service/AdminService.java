package com.xsx.cash_register_system.service;

import com.xsx.cash_register_system.entity.Admin;

public interface AdminService {
    /**
     * 用户登录
     */

    Admin getById(Integer id);
}
