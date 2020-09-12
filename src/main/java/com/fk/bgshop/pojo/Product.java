package com.fk.bgshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName Product
 * @Description TODO
 * @Date 2020/5/10 17:06
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private static final long serialVersionUID = -80098114963659439L;
    private Integer id;
    private String trade;
    private BigDecimal price;
    private Date create_time;
    private int stars;
    private String detail;
    private int cate_id;
    private String path;

}
