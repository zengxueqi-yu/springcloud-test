package com.july.cloudhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 断路器测试类
 * @author zqk
 * @since 2019/11/18
 */
@Service
public class TestHystrix {

    @Resource
    private RestTemplate restTemplate;

    /**
     * @description 测试调用服务
     * @param msg
     * @return
     * @author zqk
     * @since 2019/11/18
    */
    @HystrixCommand(fallbackMethod = "testError")
    public String test(String msg){
        return restTemplate.getForObject("http://CLOUD-CLIENT1/test?msg=" + msg,String.class);
    }

    public String testError(String msg){
        return "你好，这是测试断路器失败，" + msg;
    }

}
