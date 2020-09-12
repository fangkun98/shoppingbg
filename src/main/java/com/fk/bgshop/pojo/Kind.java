package com.fk.bgshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Kind
 * @Description TODO
 * @Date 2020/5/10 17:06
 * @Created by FangKun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kind implements Serializable {


    private static final long serialVersionUID = 7040564165258317175L;
    private int id;
    private String kind;
    private Date create_time;
}
