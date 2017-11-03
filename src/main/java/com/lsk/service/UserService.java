package com.lsk.service;

import com.lsk.domain.User;

import java.util.List;

/**
 * Created by lsk10238 on 2017/10/31.
 */
public interface UserService {
    User getUserById(int id);

    List<User> getUsers(int dataFlag);

}