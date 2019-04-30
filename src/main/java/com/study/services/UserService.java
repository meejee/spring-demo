package com.study.services;

import com.study.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by idodo-i7-01 on 2019/4/23.
 */
public class UserService {

    @Autowired
    public UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String queryUserName(Integer id) {
        return userDao.queryUserName(id);
    }
}
