package com.fk.bgshop.service.impl;

import com.fk.bgshop.mapper.OrdersMapper;
import com.fk.bgshop.pojo.Orders;
import com.fk.bgshop.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName OrdersServiceImpl
 * @Description TODO
 * @Date 2020/5/12 0:00
 * @Created by FangKun
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Resource
    OrdersMapper ordersMapper;

    @Override
    public List<Orders> getAllOrders() {
        return ordersMapper.getAllOrders();
    }

    @Override
    public List<Orders> getOrders() {
        return ordersMapper.getOrders();
    }

    @Override
    public Integer updateState(Integer id) {
        return ordersMapper.updateState(id);
    }
}
