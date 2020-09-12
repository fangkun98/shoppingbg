package com.fk.bgshop.controller;

import com.fk.bgshop.pojo.Kind;
import com.fk.bgshop.pojo.MessageResults;
import com.fk.bgshop.pojo.Product;
import com.fk.bgshop.service.KindService;
import com.fk.bgshop.service.ProductService;
import com.fk.bgshop.utils.FastDFSClient;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Date 2020/5/10 23:07
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class ProductController {
    @Resource
    ProductService productService;
    @Resource
    KindService kindService;


    @RequestMapping("/getALL")
    public String getAllProduct(Model model){
        List<Product> productList = productService.getAllProduct();
        List<Kind> kindList = kindService.getAllKind();
        model.addAttribute("productList",productList);
        model.addAttribute("kindList",kindList);
        return "product";
    }
    //新增广告
    @RequestMapping("/product_add")
    @ResponseBody
    public MessageResults contentAdd(Product product){
        MessageResults results=null;
        System.out.println("新增的对象是："+product);
        int i = productService.addProduct(product);
        if (i > 0) {
            results = new MessageResults(200, "新增成功");
        } else {
            results = new MessageResults(500, "新增失败");
        }
        return results;

    }

    //删除
    @RequestMapping("/product_delete")
    @ResponseBody
    public MessageResults deleteContent( Integer id){
        int count = productService.delProduct(id);
        MessageResults results = null;
        if (count > 0) {
            results = new MessageResults(200, "删除成功");
        } else {
            results = new MessageResults(500, "删除失败");
        }
        return results;
    }
    //跳转更新页面
    @RequestMapping("/product_goupdate")
    @ResponseBody
    public Map<String, Object> contentUpdate(Integer id) {
        //商品回显的对象
        Product product = productService.getProductById(id);
        //查询下拉框数据
        List<Kind> kindList = kindService.getAllKind();
        HashMap<String, Object> map = new HashMap<>();
        map.put("product", product);
        map.put("kindList", kindList);
        return map;
    }
    //修改商品
    @RequestMapping("/product_update")
    @ResponseBody
    public MessageResults content_update( Product product) throws Exception {
        /*
        //表单中图片地址
        String pic = product.getPath();

        //数据库的图片地址
        String oldPic = productService.getProductById(product.getId()).getPath();

       if (!oldPic.equals(pic)) {
            //表示图片有修改，删除FastDFS服务器中的图片
            //获取工具类,配置文件
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:config/fdfs_client.conf");
            //http://192.168.6.130:8866/group1/M00/00/00/wKgGglw8Z9eALUclAADAvne7424438.jpg
            //oldPic="M00/00/00/wKgGglw8Z9eALUclAADAvne7424438.jpg"; //意味着截取字符串
            System.out.println(oldPic);
            //不是服务器的图片地址会报错

            *//*
            String str1=oldPic.substring(0, oldPic.indexOf("group1/"));
            String str2=oldPic.substring(str1.length()+7, oldPic.length());
            System.out.println(str2);
            fastDFSClient.deleteFile(str2,"group1");
            *//*
        }*/
        MessageResults results = null;
        System.out.println("更新的对象是：" + product);
        int count = productService.updateProduct(product);

        if (count > 0) {
            results = new MessageResults(200, "修改成功");
        } else {
            results = new MessageResults(500, "修改失败");
        }
        return results;
    }


}
