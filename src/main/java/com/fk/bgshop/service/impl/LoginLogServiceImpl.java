package com.fk.bgshop.service.impl;

import com.fk.bgshop.mapper.LoginLogMapper;
import com.fk.bgshop.pojo.LoginLog;
import com.fk.bgshop.service.LoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName LoginLogServiceImpl
 * @Description TODO
 * @Date 2020/5/10 15:00
 * @Created by FangKun
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {
    @Resource
    private LoginLogMapper loginLogMapper;
    @Override
    public int addLoginLog(LoginLog log) {
        return loginLogMapper.addLoginLog(log);
    }

    @Override
    public List<LoginLog> getMyLoginLogs(String username) {
        return loginLogMapper.getMyLoginLogs(username);
    }
}
