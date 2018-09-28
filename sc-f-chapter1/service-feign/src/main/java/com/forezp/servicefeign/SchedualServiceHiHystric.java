package com.forezp.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @Author: luosc
 * @Description:
 * @Date:created in 9:43 2018/9/28
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
