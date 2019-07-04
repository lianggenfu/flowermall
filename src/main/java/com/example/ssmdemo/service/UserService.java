package com.example.ssmdemo.service;

import com.example.ssmdemo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    void create(User user);

    User update(User user);

    void delete(User user);
}
