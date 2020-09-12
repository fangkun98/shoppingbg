package com.fk.bgshop.service;

import com.fk.bgshop.pojo.Admin;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Date 2020/5/10 14:53
 * @Created by FangKun
 */
public interface AdminService {
    public Admin adminLogin(Admin admin);

    int updatePhoto(Admin admin);
    int updatePassword(Admin admin);
}
