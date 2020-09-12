package com.fk.bgshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName LoginLog
 * @Description TODO
 * @Date 2020/5/10 14:58
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginLog implements Serializable {

    private static final long serialVersionUID = -6554504244920511349L;
    private int id;
    private String ip;
    private String no;
    private String createtime;
    private String location;

    public LoginLog(String ip, String no, String location) {
        this.ip = ip;
        this.no = no;
        this.location = location;
    }
}