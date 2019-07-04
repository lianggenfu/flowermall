package com.example.ssmdemo.service.impl;

import com.example.ssmdemo.mapper.UserMapper;
import com.example.ssmdemo.model.User;
import com.example.ssmdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void create(User user) {
        userMapper.create(user);
    }

    @Override
    public User update(User user) {
        return userMapper.update(user);
    }

    @Override
    public void delete(User user) {

    }
}
