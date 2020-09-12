package com.fk.bgshop.service;

import com.fk.bgshop.pojo.Kind;

import java.util.List;

/**
 * @ClassName KindService
 * @Description TODO
 * @Date 2020/5/10 17:16
 * @Created by FangKun
 */
public interface KindService {
    //查询所有种类
    List<Kind> getAllKind();
    //根据id查询种类
    Kind getKindById(Integer cate_id);
    //删除种类
    int delKind(Integer cate_id);
    //添加种类
    int addKind(Kind kind);
    //修改种类
    int updateKind(Kind kind);
    //批量删除
    public int deleteSome( Integer[] ids);

}
