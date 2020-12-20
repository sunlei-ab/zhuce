package cn.gingost.service;

import cn.gingost.pojo.User;

import java.util.List;


public interface UserService {
    User findOne(User user);
    void addOne(User user);
    User checkReg(String username);
    List<User> findall();
}

