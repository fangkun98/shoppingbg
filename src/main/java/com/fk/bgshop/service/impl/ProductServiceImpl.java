package com.fk.bgshop.service.impl;

import com.fk.bgshop.mapper.ProductMapper;
import com.fk.bgshop.pojo.Page;
import com.fk.bgshop.pojo.Product;
import com.fk.bgshop.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Date 2020/5/10 23:04
 * @Created by FangKun
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper productMapper;


    @Override
    public List<Product> getAllProduct() {
        return productMapper.getAllProduct();
    }

    @Override
    public Product getProductById(Integer id) {
        return productMapper.getProductById(id);
    }

    @Override
    public int addProduct(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public int delProduct(Integer id) {
        return productMapper.delProduct(id);
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }
}
