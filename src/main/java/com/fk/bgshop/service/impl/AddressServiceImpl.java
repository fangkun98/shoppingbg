package com.fk.bgshop.service.impl;

import com.fk.bgshop.mapper.AddressMapper;
import com.fk.bgshop.pojo.Address;
import com.fk.bgshop.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AddressServiceImpl
 * @Description TODO
 * @Date 2020/5/12 0:05
 * @Created by FangKun
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    AddressMapper addressMapper;

    @Override
    public List<Address> getAllAddress() {
        return addressMapper.getAllAddress();
    }
}
