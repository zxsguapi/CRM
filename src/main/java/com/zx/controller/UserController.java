package com.zx.controller;

import com.zx.pojo.User;
import com.zx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/settings/user/login.do")
    public String login(String inusr, String inpwd, HttpSession session){
        User user = userService.login(inusr, inpwd);
        if (user!=null){
            user.setLoginPwd(null);
            session.setAttribute("user",user);
            return "workbench/index";
        }else {
            return "redirect:index";
        }
    }



}
