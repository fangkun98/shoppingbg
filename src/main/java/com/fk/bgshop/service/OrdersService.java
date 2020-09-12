package com.fk.bgshop.service;

import com.fk.bgshop.pojo.Orders;

import java.util.List;

/**
 * @ClassName OrdersService
 * @Description TODO
 * @Date 2020/5/11 23:59
 * @Created by FangKun
 */
public interface OrdersService {
    //查询所有订单
    List<Orders> getAllOrders();
    //查询未发货的订单
    List<Orders> getOrders();
    //修改订单状态 未发货-->已发货
    Integer updateState(Integer id);
}
