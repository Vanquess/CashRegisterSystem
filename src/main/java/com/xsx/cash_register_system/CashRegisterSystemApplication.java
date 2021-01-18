package com.xsx.cash_register_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xsx.cash_register_system", "com.xsx.cash_register_system.service.impl"})
public class CashRegisterSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CashRegisterSystemApplication.class, args);
    }

}
