package com.fk.bgshop.controller;

import com.fk.bgshop.pojo.*;
import com.fk.bgshop.service.AddressService;
import com.fk.bgshop.service.OrdersService;
import com.fk.bgshop.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Date 2020/5/12 0:01
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class OrderController {
    @Resource
    OrdersService ordersService;
    @Resource
    AddressService addressService;
    @Resource
    UserService userService;

    @RequestMapping("/goOrders")
    public String getAllOrders(Model model){
        List<Orders> ordersList = ordersService.getAllOrders();
        List<Address> addressList = addressService.getAllAddress();
        List<User> userList = userService.getAllUser();
        model.addAttribute("ordersList",ordersList);
        model.addAttribute("addressList",addressList);
        model.addAttribute("userList",userList);
        return "orders";
    }

    @RequestMapping("/updateOrderStatr")
    public void updateOrderStatr(@RequestParam("id") Integer id){
        int i = ordersService.updateState(id);
    }

    @RequestMapping("/OrdersCheck")
    public String getOrders(Model model){
        List<Orders> ordersList = ordersService.getOrders();
        List<Address> addressList = addressService.getAllAddress();
        List<User> userList = userService.getAllUser();
        model.addAttribute("ordersList",ordersList);
        model.addAttribute("addressList",addressList);
        model.addAttribute("userList",userList);
        return "ordersCheck";
    }



}
