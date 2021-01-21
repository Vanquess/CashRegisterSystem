package com.xsx.cash_register_system.service.impl;

import com.xsx.cash_register_system.dao.AdminDao;
import com.xsx.cash_register_system.dao.impl.AdminDaoImpl;
import com.xsx.cash_register_system.entity.Admin;
import com.xsx.cash_register_system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
//@ComponentScan(basePackages = {"com.xsx.cash_register_system.dao"})
public class AdminServiceImpl implements AdminService {

//    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin getById(Integer id) {
        return adminDao.findById(id);
    }
}
