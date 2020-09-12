package com.fk.bgshop.mapper;

import com.fk.bgshop.pojo.Kind;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName KindMapper
 * @Description TODO
 * @Date 2020/5/10 17:09
 * @Created by FangKun
 */
@Mapper
public interface KindMapper {
    //查询所有种类
    List<Kind> getAllKind();
    //根据id查询种类
    Kind getKindById(Integer id);
    //删除种类
    int delKind(Integer id);
    //添加种类
    int addKind(Kind kind);
    //修改种类
    int updateKind(Kind kind);
    //批量删除
    public int deleteSome( Integer[] ids);


}
