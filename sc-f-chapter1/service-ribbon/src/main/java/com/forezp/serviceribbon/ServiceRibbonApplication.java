package com.forezp.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者（rest+ribbon）(Finchley版本)
 *
 * @Description: java类作用描述: serviceRibbon启动入口类
 * <p>
 * 通过@EnableDiscoveryClient或@EnableEurekaClient向服务中心注册,
 * @EnableEurekaClien只能Eureka使用，
 * @EnableDiscoveryClient可以通用<p/>
 * 使用断路器
 * @EnableHystrix注解开启Hystrix
 * @Author: luosc
 * @CreateDate: 2018/9/27 16:28
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    /**
     * 向程序IOC注入bean restTemplate,并通过LoadBalanced表明这个restTemplate 开启负载均衡功能
     *
     * @param
     * @return
     * @Author luosc
     * @Date 2018/9/27 16:30
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
