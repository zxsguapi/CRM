package com.zx.service.impl;

import com.zx.dao.UserDao;
import com.zx.pojo.User;
import com.zx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String inusr, String inpwd) {

        User user = userDao.login(inusr, inpwd);
        return user;
    }
}
