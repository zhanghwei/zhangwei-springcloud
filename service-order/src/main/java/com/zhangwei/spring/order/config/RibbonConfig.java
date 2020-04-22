package com.zhangwei.spring.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced//负载均衡
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
    //指定负载均衡算法
    @Bean
    public IRule iRule(){
        //随机算法
       // return new RandomRule();
        return new RoundRobinRule();
    }

}
