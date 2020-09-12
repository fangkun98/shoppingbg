package com.fk.bgshop.controller;

import com.fk.bgshop.pojo.Admin;
import com.fk.bgshop.pojo.LoginLog;
import com.fk.bgshop.pojo.MessageResults;
import com.fk.bgshop.service.AdminService;
import com.fk.bgshop.service.LoginLogService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Date 2020/5/10 14:54
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class AdminController {
    @Resource
    private AdminService adminService;
    @Resource
    private LoginLogService loginLogService;

    @RequestMapping("/admin_login")
    @ResponseBody
    public MessageResults adminLogin( Admin admin, String ip , String city, HttpSession session){
        //获取用户登录ip和登陆的城市
        //1.获取IP之前 调用WebService，查询IP对应的城市
        //2.直接JS前端调用接口
        MessageResults results=null;
        Admin adminLogin = adminService.adminLogin(admin);
        System.out.println(adminLogin);
        if(adminLogin != null){
            session.setAttribute("adminLogin", adminLogin);
            Date date = new Date();
            session.setAttribute("createTime",date);
            results = new MessageResults(200, "登录成功");

            //日志新增
            LoginLog loginLog=new LoginLog(ip,admin.getUsername(),city);
            int count = loginLogService.addLoginLog(loginLog);

        }else {
            results=new MessageResults(500,"登录失败");
        }
        return results;
    }

    @RequestMapping("/admin_logout")
    public String admin_logout(HttpSession session){
        session.invalidate();
        return "login";
    }

    @RequestMapping("/admin_getLoginLogs")
    @ResponseBody
    public List<LoginLog> getLoginLogs(HttpSession session){
        Admin adminLogin = (Admin) session.getAttribute("adminLogin");
        List<LoginLog> myLoginLogs = loginLogService.getMyLoginLogs(adminLogin.getUsername());
        return myLoginLogs;
    }

//    HttpSession session

    @RequestMapping("/adminInfo")
    public String adminInfo(HttpSession session, Model model){
        Admin adminLogin = (Admin) session.getAttribute("adminLogin");
        System.out.println(adminLogin);
        model.addAttribute("adminLogin",adminLogin);

        return "userInfo";
    }

    @RequestMapping("/admin_updatePassword")
    @ResponseBody
    public MessageResults updatePassword(HttpSession session,String password0,String password1,String password2){
       MessageResults results=null;
        Admin admin =(Admin)session.getAttribute("adminLogin");
        String password = admin.getPassword();
        if (password.equals(password0)&&password1.equals(password2)){
            admin.setPassword(password1);
            Integer integer = adminService.updatePassword(admin);
            if (integer>0){
                results =new MessageResults(200,"密码修改成功");
            }else {
                results = new MessageResults(404, "修改失败,请重试");
            }
        }else {
            results = new MessageResults(500,"输入有误,请重试");
        }
      return results;
    }
}
