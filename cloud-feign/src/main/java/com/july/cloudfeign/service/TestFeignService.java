package com.july.cloudfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 测试服务消费者
 * @author zqk
 * @since 2019/11/17
 */
@FeignClient("cloud-client1")
public interface TestFeignService {

    @RequestMapping("/test")
    String test(@RequestParam(value = "msg") String name);

}
