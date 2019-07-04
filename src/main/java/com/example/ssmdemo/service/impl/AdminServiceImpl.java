package com.example.ssmdemo.service.impl;

import com.example.ssmdemo.mapper.AdminMapper;
import com.example.ssmdemo.model.Admin;
import com.example.ssmdemo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }

    @Override
    public Admin findById(Long id) {
        return adminMapper.findById(id);
    }
}
