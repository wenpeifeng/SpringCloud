package com.ahead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 启动类
@SpringBootApplication
@EnableEurekaClient  // 开启Eureka客户端注解，在服务启动后自动向注册中心(EurekaServer)注册服务
@EnableDiscoveryClient // 开启服务发现客户端的注解，可以用来获取一些配置的信息，得到具体的微服务
public class DeptProvider_8001 {

    public static void main(String[] args) {
        /**
         * @param1: 当前类的class对象
         * @param2： 当前类的args对象
         */
        SpringApplication.run(DeptProvider_8001.class,args);
    }
}
