package com.xsx.cash_register_system.controller;

import com.xsx.cash_register_system.entity.Admin;
import com.xsx.cash_register_system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@ComponentScan(basePackages = {"com.xsx.cash_register_system.service", "com.xsx.cash_register_system.service.impl"})
public class Login {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = {"/login"})
    public String LoginPage() {

        return "login";
    }

    @PostMapping(value = {"/loginAction"})
    public String login(Integer id, String password) {
        Admin admin = adminService.LoginAdmin();
        if (admin == null) {
            return "dashboard";
        }
        if (admin.getPassword().equals(password)) {
            return "dashboard";
        } else {
            return "dashboard";
        }
    }
}
