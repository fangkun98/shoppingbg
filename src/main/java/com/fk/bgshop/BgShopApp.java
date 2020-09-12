package com.fk.bgshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName BgShopApp
 * @Description TODO
 * @Date 2020/5/10 14:37
 * @Created by FangKun
 */
@SpringBootApplication
public class BgShopApp {
    public static void main(String[] args) {
        System.out.println("小米商城后台管理");
        SpringApplication.run(BgShopApp.class,args);
    }
}
