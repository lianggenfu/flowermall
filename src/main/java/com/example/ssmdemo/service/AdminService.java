package com.example.ssmdemo.service;

import com.example.ssmdemo.model.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> findAll();

    Admin findById(Long id);
}
