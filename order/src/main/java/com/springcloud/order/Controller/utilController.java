package com.springcloud.order.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: demo
 * @description
 * @author: chenshuofang
 * @create: 2020-12-02 08:40
 **/

@RestController
public class utilController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/orderTest1")
    public String orderTest1(){
        String str = restTemplate.getForObject("http://order-server/orderTest",String.class);
        return str;
    }

    @RequestMapping("orderTest")
    public String orderTest(){
        return "this is ordor";
    }
}
