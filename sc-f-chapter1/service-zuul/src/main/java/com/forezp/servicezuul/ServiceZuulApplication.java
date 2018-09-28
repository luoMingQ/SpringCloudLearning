package com.forezp.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
*   ServiceZuul入口
* @Description: java类作用描述:路由网关 serviceZuul入口类
 * @EnableZuulProxy，开启zuul的功能
* @Author: luosc
* @CreateDate: 2018/9/28 10:42
* @Version: 1.0
*/
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }
}
