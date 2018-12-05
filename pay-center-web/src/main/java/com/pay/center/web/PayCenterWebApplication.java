package com.pay.center.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.pay.*"})
@MapperScan("com.pay.center.core.dao")
public class PayCenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayCenterWebApplication.class, args);
    }
}
