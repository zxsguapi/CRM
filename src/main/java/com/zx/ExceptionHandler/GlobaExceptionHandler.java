package com.zx.ExceptionHandler;


import com.zx.exception.LoginException1;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobaExceptionHandler {


    @ExceptionHandler(LoginException1.class)
    @ResponseBody
    public String loginEx(Exception e){
        String message = e.getMessage();

        return message;
    }
}
