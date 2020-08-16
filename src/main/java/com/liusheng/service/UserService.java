package com.liusheng.service;

import com.liusheng.entity.User;

import java.util.List;

public interface UserService {

    public List<User> queryUsers();

    public Integer insertUser(User user);
}
