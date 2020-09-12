package com.fk.bgshop.mapper;

import com.fk.bgshop.pojo.LoginLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName LoginLogMapper
 * @Description TODO
 * @Date 2020/5/10 14:59
 * @Created by FangKun
 */
@Mapper
public interface LoginLogMapper {
    //新增
    public int addLoginLog(LoginLog log);
    //获取最近时刻登录信息
    public List<LoginLog> getMyLoginLogs(String username);
}