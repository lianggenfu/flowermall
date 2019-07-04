package com.example.ssmdemo.mapper;

import com.example.ssmdemo.model.condition.BaseCondition;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {

    int create(T obj);

    int update(T obj);

    int delete(T obj);

    T findById(Serializable id);

    T findByCode(Serializable code);

    List<T> find(T obj);

    List<T> findAll();

    List searchList(BaseCondition condition);

    int searchCount(BaseCondition condition);

}
