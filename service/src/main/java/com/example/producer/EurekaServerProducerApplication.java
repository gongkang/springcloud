package com.example.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by gongkang on 2017/8/9.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerProducerApplication.class, args);
    }
}
