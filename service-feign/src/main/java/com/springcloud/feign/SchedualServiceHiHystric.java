package com.springcloud.feign;

import org.springframework.stereotype.Component;

/**
 * @author:lifuyi
 * @Date: 2018/12/27 16:14
 * @Description:熔断器实现类
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
