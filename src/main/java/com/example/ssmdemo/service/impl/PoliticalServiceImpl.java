package com.example.ssmdemo.service.impl;

import com.example.ssmdemo.mapper.PoliticalMapper;
import com.example.ssmdemo.model.Page;
import com.example.ssmdemo.model.Political;
import com.example.ssmdemo.model.bo.PoliticalBo;
import com.example.ssmdemo.model.condition.PoliticalSearchPageCondition;
import com.example.ssmdemo.service.PoliticalService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PoliticalServiceImpl implements PoliticalService {

    @Resource
    private PoliticalMapper politicalMapper;

    @Override
    public Political findById(Long id) {
        return politicalMapper.findById(id);
    }

    @Override
    public PoliticalBo createByBo(PoliticalBo politicalBo) {
        return null;
    }

    @Override
    public PoliticalBo updateByBo(PoliticalBo politicalBo) {
        return null;
    }

    @Override
    public void delete(PoliticalBo politicalBo) {

    }

    @Override
    public Page<PoliticalBo> search(PoliticalSearchPageCondition condition) {
        Page<Political> politicalPage = new Page<>();
        Page<PoliticalBo> politicalBoPage = new Page<>();
        List<PoliticalBo> politicalBos = new ArrayList<>();
        politicalPage.setResults(politicalMapper.searchList(condition));
        politicalBoPage.setTotal(politicalMapper.searchCount(condition));
        for (Political political : politicalPage.getResults()){
            PoliticalBo politicalBo = new PoliticalBo();
            BeanUtils.copyProperties(political,politicalBo);
            politicalBos.add(politicalBo);
        }
        politicalBoPage.setResults(politicalBos);
        return politicalBoPage;
    }

    @Override
    public int searchCount(PoliticalSearchPageCondition condition) {
        return politicalMapper.searchCount(condition);
    }
}
