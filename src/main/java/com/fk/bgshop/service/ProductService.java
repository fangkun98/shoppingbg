package com.fk.bgshop.service;

import com.fk.bgshop.pojo.Page;
import com.fk.bgshop.pojo.Product;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Date 2020/5/10 23:04
 * @Created by FangKun
 */
public interface ProductService {
    //查询所有
    List<Product> getAllProduct();
    //添加分页
//    PageInfo getAllProduct(Page page);

    //根据id查询
    Product getProductById(Integer id);
    //增加
    int addProduct(Product product);
    //删除
    int delProduct(Integer id);
    //修改
    int updateProduct(Product product);
}
