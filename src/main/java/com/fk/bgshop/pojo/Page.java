package com.fk.bgshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Page
 * @Description TODO
 * @Date 2020/5/10 23:09
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page {
    private Integer pageNum;
    private Integer pageSize=10;

    public Page(int pageNum) {
        this.pageNum=pageNum;
    }
}
