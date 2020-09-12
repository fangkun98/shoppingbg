package com.fk.bgshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Date 2020/5/12 0:12
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 2542898513137543384L;
    private int id;
    private String username;
    private String password;
    private String email;
    private String sex;
    private Date regist_time;
    private String salt;
}
