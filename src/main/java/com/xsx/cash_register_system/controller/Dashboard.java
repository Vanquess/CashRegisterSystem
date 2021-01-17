package com.xsx.cash_register_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dashboard {

    @RequestMapping(value = "/dashboard")
    public String Dashboard() {

        return "dashboard";
    }
}
