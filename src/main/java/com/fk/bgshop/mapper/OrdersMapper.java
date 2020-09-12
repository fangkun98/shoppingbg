package com.fk.bgshop.mapper;

import com.fk.bgshop.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName OrdersMapper
 * @Description TODO
 * @Date 2020/5/11 23:51
 * @Created by FangKun
 */
@Mapper
public interface OrdersMapper {
    //查询所有订单
    List<Orders> getAllOrders();
    //查询未发货的订单
    List<Orders> getOrders();
    //修改订单状态 未发货-->已发货
    Integer updateState(Integer id);
}
