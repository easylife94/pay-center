package com.pay.center.web;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayCenterWebApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void userPassword() {
        String hashAlgorithmName = "MD5";//加密方式
        Object crdentials = "123456";//密码原值
        String salt = UUID.randomUUID().toString();
        ByteSource saltByte = ByteSource.Util.bytes(salt);//以随机数作为盐值
        int hashIterations = 1;//加密1次
        Object result = new SimpleHash(hashAlgorithmName,crdentials,saltByte,hashIterations);
        System.out.println("salt:"+salt);
        System.out.println("test"+":"+result);
    }

}
