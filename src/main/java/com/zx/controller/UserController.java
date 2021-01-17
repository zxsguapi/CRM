package com.zx.controller;

import com.zx.exception.LoginException1;
import com.zx.pojo.User;
import com.zx.service.UserService;
import com.zx.utils.DateTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/settings/user/login.do")
    public String login(String name,String pwd){
        User user = userService.login(name, pwd);

        String sysTime= DateTimeUtil.getSysTime();
        String expireTime = user.getExpireTime();
        int i = expireTime.compareTo(sysTime);

        if (user!=null) {
           if (user.getLockState().contentEquals("1")) {
               throw new LoginException1("账号锁定");
           }else if (i<0){
               throw new LoginException1("账号失效");
           }
           return "true";
       }
        return "false";
    }
}
