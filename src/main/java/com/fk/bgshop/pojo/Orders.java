package com.fk.bgshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Orders
 * @Description TODO
 * @Date 2020/5/11 23:50
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements Serializable {

    private static final long serialVersionUID = -5117282243975559080L;
    private Integer id;
    private Integer uid;
    private Integer pid;
    private String pname;
    private Integer num;
    private String price;
    private String money;
    private Date create_time;
    private Integer order_state;
    private Integer address_id;
}
