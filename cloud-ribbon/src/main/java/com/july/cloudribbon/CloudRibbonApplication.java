package com.july.cloudribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者
 * @author zqk
 * @since 2019/11/16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
