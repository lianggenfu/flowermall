package com.example.ssmdemo.mapper;

import com.example.ssmdemo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();

    User findById(Long id);

    void create(User user);

    User update(User user);

    void delete(User user);

}
