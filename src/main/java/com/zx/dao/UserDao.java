package com.zx.dao;


import com.zx.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User login(String name,String pwd);
}
