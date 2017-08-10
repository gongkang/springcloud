package com.example.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by gongkang on 2017/8/9.
 */
@Service
public class ConsumerRibbonService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errServiceFallback")
    public String compute() {
        return restTemplate.getForEntity("http://compute-service/add?a=10&b=20", String.class).getBody();
    }

    public String errServiceFallback() {
        return "errorWithRibbon";
    }
}
