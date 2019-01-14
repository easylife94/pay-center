package com.pay.center.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.pay.*"})
@MapperScan("com.pay.center.core.dao")
@EnableEurekaClient
@EnableFeignClients
public class PayCenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayCenterWebApplication.class, args);
    }
}
