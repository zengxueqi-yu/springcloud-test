package com.july.cloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者
 * @author zqk
 * @since 2019/11/15
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }

}
