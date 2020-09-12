package com.fk.bgshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Admin
 * @Description TODO
 * @Date 2020/5/10 14:41
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    private static final long serialVersionUID = 4087422696462042778L;

    Integer id;
    String username;
    String password;
    String photo;
}
