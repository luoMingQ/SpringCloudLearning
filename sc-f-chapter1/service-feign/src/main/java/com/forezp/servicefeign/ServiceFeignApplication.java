package com.forezp.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者（Feign）(Finchley版本)
 *
 * @Description: java类作用描述:
 * @EnableFeignClients注解开启Feign的功能 通过@EnableDiscoveryClient或@EnableEurekaClient向服务中心注册,
 * @EnableEurekaClien只能Eureka使用，
 * @EnableDiscoveryClient可以通用<p/>
 * @Author: luosc
 * @CreateDate: 2018/9/27 17:42
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
