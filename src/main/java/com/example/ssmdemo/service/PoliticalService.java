package com.example.ssmdemo.service;

import com.example.ssmdemo.model.Page;
import com.example.ssmdemo.model.Political;
import com.example.ssmdemo.model.bo.PoliticalBo;
import com.example.ssmdemo.model.condition.PoliticalSearchPageCondition;

import java.util.List;

public interface PoliticalService {

    Political findById(Long id);

    PoliticalBo createByBo(PoliticalBo politicalBo);

    PoliticalBo updateByBo(PoliticalBo politicalBo);

    void delete(PoliticalBo politicalBo);

    Page<PoliticalBo> search(PoliticalSearchPageCondition condition);

    int searchCount(PoliticalSearchPageCondition condition);
}
