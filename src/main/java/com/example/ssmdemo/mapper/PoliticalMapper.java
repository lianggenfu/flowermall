package com.example.ssmdemo.mapper;

import com.example.ssmdemo.model.Political;
import com.example.ssmdemo.model.condition.PoliticalSearchPageCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PoliticalMapper{

    Political findById(Long id);

    List<Political> searchList(PoliticalSearchPageCondition condition);

    int searchCount(PoliticalSearchPageCondition condition);

}
