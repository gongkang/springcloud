package com.example.producer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by gongkang on 2017/8/9.
 */
@RestController
public class ServiceInstanceRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceInstanceRestController.class);

    /**
     * 服务发现的客户端
     * 由spring-cloud-starter-eureka包提供
     */
    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * 提供get请求的映射
     * @param a
     * @param b
     * @return
     */
    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        Integer r = a + b;
        LOGGER.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
