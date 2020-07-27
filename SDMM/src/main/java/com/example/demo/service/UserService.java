package com.example.demo.service;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(int id);
    void update(User user);
    List<User> queryAllUser();
}
