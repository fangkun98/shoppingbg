package com.fk.bgshop.service;

import com.fk.bgshop.pojo.LoginLog;

import java.util.List;

/**
 * @ClassName LoginLogService
 * @Description TODO
 * @Date 2020/5/10 15:00
 * @Created by FangKun
 */
public interface LoginLogService {
    //新增
    public int addLoginLog(LoginLog log);
    //获取最近时刻登录信息
    public List<LoginLog> getMyLoginLogs(String username);
}
