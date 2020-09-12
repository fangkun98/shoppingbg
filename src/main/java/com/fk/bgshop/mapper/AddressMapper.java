package com.fk.bgshop.mapper;

import com.fk.bgshop.pojo.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName AddressMapper
 * @Description TODO
 * @Date 2020/5/12 0:03
 * @Created by FangKun
 */
@Mapper
public interface AddressMapper {
    //查询所有地址
    List<Address> getAllAddress();
}
