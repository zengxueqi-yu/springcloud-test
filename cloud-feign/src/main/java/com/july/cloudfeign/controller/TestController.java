package com.july.cloudfeign.controller;

import com.july.cloudfeign.service.TestFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试服务消费者
 * @author zqk
 * @since 2019/11/17
 */
@RestController
public class TestController {

    @Resource
    private TestFeignService testFeignService;

    @RequestMapping("/test")
    public String test(@RequestParam String msg){
        return testFeignService.test(msg);
    }

}
