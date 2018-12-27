package com.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author:lifuyi
 * @Date: 2018/12/26 16:43
 * @Description:
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;


    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }


}
