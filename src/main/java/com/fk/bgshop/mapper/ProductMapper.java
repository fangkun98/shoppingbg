package com.fk.bgshop.mapper;

import com.fk.bgshop.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName ProductMapper
 * @Description TODO
 * @Date 2020/5/10 22:49
 * @Created by FangKun
 */
@Mapper
public interface ProductMapper {
    //查询所有
    List<Product> getAllProduct();
    //根据id查询
    Product getProductById(Integer id);
    //增加
    int addProduct(Product product);
    //删除
    int delProduct(Integer id);
    //修改
    int updateProduct(Product product);

}
