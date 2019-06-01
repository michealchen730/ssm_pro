package com.scdn.service.impl;

import com.scdn.dao.UserDao;
import com.scdn.domain.User;
import com.scdn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User findById(int id) {
        return this.userDao.findById(id);
    }
}
