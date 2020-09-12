package com.fk.bgshop.controller;

import com.fk.bgshop.pojo.Address;
import com.fk.bgshop.pojo.Orders;
import com.fk.bgshop.pojo.User;
import com.fk.bgshop.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Date 2020/5/12 23:50
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/goUser")
    public String getAllOrders(Model model){
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "users";
    }
}
