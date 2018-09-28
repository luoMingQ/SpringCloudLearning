package com.forezp.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: luosc
 * @Description:
 * @Date:created in 16:37 2018/9/27
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * @HystrixCommand注解。该注解对该方法创建了熔断器的功能，并指定熔断方法 fallbackMethod
     * @return
     * @Author luosc
     * @param
     * @Date 2018/9/28 9:28
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
