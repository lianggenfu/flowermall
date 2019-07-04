package com.example.ssmdemo;

import com.example.ssmdemo.model.Page;
import com.example.ssmdemo.model.Political;
import com.example.ssmdemo.model.bo.PoliticalBo;
import com.example.ssmdemo.model.condition.PoliticalSearchPageCondition;
import com.example.ssmdemo.service.PoliticalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BaseInfoTest {

    @Autowired
    private PoliticalService politicalService;

    @Test
    public void selectTest(){
        Political political = politicalService.findById(1L);
        System.out.println(political);
    }
    @Test
    public void findAll(){
        PoliticalSearchPageCondition condition = new PoliticalSearchPageCondition();
        Page<PoliticalBo> politicalBoPage = politicalService.search(condition);
        System.out.println(politicalBoPage.getTotal());
    }

    @Test
    public void searchCount(){
        PoliticalSearchPageCondition condition = new PoliticalSearchPageCondition();
        condition.setSearchText("梁");
        int total = politicalService.searchCount(condition);
        System.out.println("total"+total);
    }
}
