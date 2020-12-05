package com.springcloud.member.Controller;

import com.springcloud.member.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description
 * @author: chenshuofang
 * @create: 2020-12-02 09:24
 **/
@RestController
public class utilController {
    @Autowired
    private MemberService memberService;
    @RequestMapping("memberTest")
    public String orderTest(){
        return "this is member";
    }


    @RequestMapping("/memTest")
    public String memTest(){
        String str = memberService.memberTest();
        return str;
    }
}