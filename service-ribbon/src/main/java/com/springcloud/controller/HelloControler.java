package com.springcloud.controller;

import com.springcloud.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:lifuyi
 * @Date: 2018/12/26 16:54
 * @Description:
 */
@RestController
@RequestMapping(value = "ribbon")
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        System.out.println("djsdjsd");
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/test")
    public String testM(){
        return "dddd";
    }

}
