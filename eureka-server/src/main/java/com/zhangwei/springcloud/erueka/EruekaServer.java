package com.zhangwei.springcloud.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EruekaServer {
    public static void main(String[] args) {
        SpringApplication.run(EruekaServer.class,args);
    }
}
