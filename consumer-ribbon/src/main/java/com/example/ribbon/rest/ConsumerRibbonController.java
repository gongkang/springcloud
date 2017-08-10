package com.example.ribbon.rest;

import com.example.ribbon.service.ConsumerRibbonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by gongkang on 2017/8/9.
 */
@RestController
public class ConsumerRibbonController {

    @Resource
    private ConsumerRibbonService consumerRibbonService;

    @RequestMapping(value = "/add")
    public String add() {
        return consumerRibbonService.compute();
    }
}
