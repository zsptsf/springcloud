package com.springcloud.member.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: demo
 * @description
 * @author: chenshuofang
 * @create: 2020-12-02 15:05
 **/
@Service
@FeignClient("member-server")
public interface MemberService {
    @RequestMapping("/memberTest")
    public String memberTest();
}
