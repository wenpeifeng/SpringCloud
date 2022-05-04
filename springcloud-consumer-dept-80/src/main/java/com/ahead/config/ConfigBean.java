package com.ahead.config;

import lombok.extern.java.Log;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    /**
     * RestTemplate提供了多种便捷访问远程Http服务的方法
     * 是一种简单便捷的访问restful服务模板类，是spring提供的用于访问Rest服务的客户端模板工具集
     */
    @LoadBalanced //配置负载均衡实现RestTemplate
    @Bean // 将RestTemplate注入到IOC容器中
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
