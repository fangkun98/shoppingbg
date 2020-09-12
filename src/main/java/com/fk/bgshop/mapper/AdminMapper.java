package com.fk.bgshop.mapper;

import com.fk.bgshop.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName AdminMapper
 * @Description TODO
 * @Date 2020/5/10 14:50
 * @Created by FangKun
 */
@Mapper
public interface AdminMapper {
    public Admin adminLogin(Admin admin);

    int updatePhoto(Admin admin);
    int updatePassword(Admin admin);
}
