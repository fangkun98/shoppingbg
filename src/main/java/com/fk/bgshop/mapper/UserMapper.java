package com.fk.bgshop.mapper;

import com.fk.bgshop.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2020/5/12 0:13
 * @Created by FangKun
 */
@Mapper
public interface UserMapper {
    List<User> getAllUser();
}
