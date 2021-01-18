package com.zx.config;

import com.zx.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("进入拦截器");
        User user = (User) request.getSession().getAttribute("user");
        if (user ==null){

            response.sendRedirect("/index");
            return false;
        }

        return true;
    }
}
