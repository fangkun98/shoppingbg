package com.fk.bgshop.controller;

import com.fk.bgshop.pojo.Address;
import com.fk.bgshop.pojo.Orders;
import com.fk.bgshop.pojo.User;
import com.fk.bgshop.service.AddressService;
import com.fk.bgshop.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AddressController
 * @Description TODO
 * @Date 2020/5/12 23:23
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class AddressController {
    @Resource
    AddressService addressService;
    @Resource
    UserService userService;

    @RequestMapping("/goAddress")
    public String getOrders(Model model){
        List<Address> addressList = addressService.getAllAddress();
        List<User> userList = userService.getAllUser();
        model.addAttribute("addressList",addressList);
        model.addAttribute("userList",userList);
        return "address";
    }


}
