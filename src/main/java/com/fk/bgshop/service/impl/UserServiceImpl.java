package com.fk.bgshop.service.impl;

import com.fk.bgshop.mapper.UserMapper;
import com.fk.bgshop.pojo.User;
import com.fk.bgshop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Date 2020/5/12 0:15
 * @Created by FangKun
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
