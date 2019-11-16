package com.july.cloudribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 测试注册的服务
 * @author zqk
 * @since 2019/11/16
 */
@Service
public class TestRibbon {

    @Resource
    private RestTemplate restTemplate;

    public String testRibbon(String msg){
        return restTemplate.getForObject("http://CLOUD-CLIENT1/test?msg=" + msg,String.class);
    }

}
