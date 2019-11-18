package com.july.cloudhystrix.controller;

import com.july.cloudhystrix.service.TestHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试断路器信息
 * @author zqk
 * @since 2019/11/18
 */
@RestController
public class TestController {

    @Resource
    private TestHystrix testHystrix;

    @RequestMapping("/test")
    public String test(@RequestParam String msg){
        return testHystrix.test(msg);
    }

}
