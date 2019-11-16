package com.july.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册启动类
 * @author zqk
 * @since 2019/11/15
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerApplication.class, args);
    }

}
