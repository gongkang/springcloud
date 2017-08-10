package com.example.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by gongkang on 2017/8/9.
 */
@EnableEurekaServer // 启用一个注册中心
@SpringBootApplication
public class EurekaServiceRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceRegisterApplication.class, args);
    }
}
