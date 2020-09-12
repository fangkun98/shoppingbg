package com.fk.bgshop.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName CommonController
 * @Description TODO
 * @Date 2020/5/10 15:44
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class CommonController {

    @RequestMapping({"/","/admin"})
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/page_{page}")
    public String page(@PathVariable("page") String page){
        return page;
    }

}
