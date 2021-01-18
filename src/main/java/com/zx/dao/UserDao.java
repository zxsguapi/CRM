package com.zx.dao;


import com.zx.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {

    User login(String inusr,String inpwd);
}
