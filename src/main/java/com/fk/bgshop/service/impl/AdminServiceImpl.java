package com.fk.bgshop.service.impl;

import com.fk.bgshop.mapper.AdminMapper;
import com.fk.bgshop.pojo.Admin;
import com.fk.bgshop.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Date 2020/5/10 14:53
 * @Created by FangKun
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin adminLogin (Admin admin) {
        return adminMapper.adminLogin(admin);
    }

    @Override
    public int updatePhoto(Admin admin) {
        return adminMapper.updatePhoto(admin);
    }

    @Override
    public int updatePassword(Admin admin) {
        return adminMapper.updatePassword(admin);
    }
}
