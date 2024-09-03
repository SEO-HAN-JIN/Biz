package com.example.demo.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/system/auth-manage")
public class AuthManageController {

    @GetMapping("/user")
    public String authManageUser() {
        return "system/auth-manage/user";
    }

    @GetMapping("/resource")
    public String authManageResource() {
        return "system/auth-manage/resource";
    }

    @GetMapping("/role")
    public String authManageRole() {
        return "system/auth-manage/role";
    }


}
