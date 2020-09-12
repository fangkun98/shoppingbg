package com.fk.bgshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName MessageResults
 * @Description TODO
 * @Date 2020/5/10 15:02
 * @Created by FangKun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResults {
    private Integer code;
    private String message;
}
