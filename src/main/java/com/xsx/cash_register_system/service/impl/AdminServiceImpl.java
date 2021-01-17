package com.xsx.cash_register_system.service.impl;

import com.xsx.cash_register_system.dao.AdminDao;
import com.xsx.cash_register_system.dao.impl.AdminDaoImpl;
import com.xsx.cash_register_system.service.AdminService;


public class AdminServiceImpl implements AdminService {

    private AdminDao adminDao = new AdminDaoImpl();

    @Override
    public String LoginAdmin(int id, String password) {
        return null;
    }
}
