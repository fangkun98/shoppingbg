package com.fk.bgshop.service;

import com.fk.bgshop.pojo.Address;

import java.util.List;

/**
 * @ClassName AddressService
 * @Description TODO
 * @Date 2020/5/12 0:05
 * @Created by FangKun
 */
public interface AddressService {
    //查询所有地址
    List<Address> getAllAddress();
}
