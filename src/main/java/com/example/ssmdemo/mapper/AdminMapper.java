package com.example.ssmdemo.mapper;

import com.example.ssmdemo.model.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

    List<Admin> findAll();

    Admin findById(Long id);
}
