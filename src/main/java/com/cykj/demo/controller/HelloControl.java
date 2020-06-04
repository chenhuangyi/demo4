package com.cykj.demo.controller;

import com.cykj.demo.entity.Admin;
import com.cykj.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {

    @Autowired
    private AdminService adminService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("getAdmin")
    public Object getAdmin(){
        Admin loginadmin=new Admin();
        loginadmin.setAccount("admin");
        loginadmin.setPassword("123");

        Admin admin = adminService.login(loginadmin);
        return admin;
    }
}
