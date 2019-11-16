package com.july.cloudribbon;

import com.july.cloudribbon.service.TestRibbon;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试服务消费信息
 * @author zqk
 * @since 2019/11/16
 */
@RestController
public class TestController {

    @Resource
    private TestRibbon testRibbon;

    @RequestMapping("/test")
    public String test(@RequestParam String msg){
        return testRibbon.testRibbon(msg);
    }

}
