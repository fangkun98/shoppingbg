package com.fk.bgshop.controller;

import com.fk.bgshop.pojo.Kind;
import com.fk.bgshop.pojo.MessageResults;
import com.fk.bgshop.service.KindService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName KindController
 * @Description TODO
 * @Date 2020/5/10 17:18
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class KindController {
    @Resource
    KindService kindService;

    @RequestMapping("/kind_get")
    public String getBrands(Model model){
        List<Kind> kindList = kindService.getAllKind();
        model.addAttribute("kindList",kindList);
        return "kind";
    }

    @RequestMapping("/kind_add")
    @ResponseBody
    public MessageResults addBrand(Kind kind){
        MessageResults results=null;
        int count = kindService.addKind(kind);
        if(count>0){
            results=new MessageResults(200,"新增成功");
        }else {
            results=new MessageResults(500,"新增失败");
        }
        return results;

    }

    @RequestMapping("/kind_getById")
    @ResponseBody
    public Kind getBrandById( Integer id){
        return kindService.getKindById(id);
    }

    @RequestMapping("/kind_update")
    @ResponseBody
    public MessageResults updateBrand(Kind kind){
        MessageResults results=null;
        int count = kindService.updateKind(kind);
        if(count>0){
            results=new MessageResults(200,"修改成功");
        }else {
            results=new MessageResults(500,"修改失败");
        }
        return results;
    }

    @RequestMapping("/kind_delete")
    @ResponseBody
    public MessageResults deleteBrand(Integer id){
        MessageResults results=null;
        int count = kindService.delKind(id);
        if(count>0){
            results=new MessageResults(200,"删除成功");
        }else {
            results=new MessageResults(500,"删除失败");
        }
        return results;
    }

    @RequestMapping("/kind_deleteSome")
    @ResponseBody
    public MessageResults deleteSome1(Integer[] ids){
        MessageResults results=null;
        int count = kindService.deleteSome(ids);
//        System.out.println("ids"+ids);
        if(count>0){
            results=new MessageResults(200,"批量删除成功");
        }else {
            results=new MessageResults(500,"批量删除失败");
        }
        return results;
    }

    @RequestMapping("/kind_list")
    @ResponseBody
    public List<Kind> getKindList(){
        return kindService.getAllKind();
    }




}
