package com.fk.bgshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Address
 * @Description TODO
 * @Date 2020/5/12 0:02
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {
    private static final long serialVersionUID = 2230122197739790607L;
    private Integer id;
    private Integer uid;
    private String name;
    private String phone;
    private String province;
    private String city;
    private String detail;
    private Integer state;
}
