package com.pay.center.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.pay.*"})
public class PayCenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayCenterWebApplication.class, args);
    }
}
