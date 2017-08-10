package com.example.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * SpringCloudApplication注解它整合了
 *  SpringBootApplication
 *  EnableDiscoveryClient 启用服务发现功能
 *  EnableCircuitBreaker 启用断路由功能
 * Created by gongkang on 2017/8/9.
 */
@SpringCloudApplication
public class EurekaConsumerRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }

    @Bean //定义REST客户端，RestTemplate实例
    @LoadBalanced //开启负载均衡的能力
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
