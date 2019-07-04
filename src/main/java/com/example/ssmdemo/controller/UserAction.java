package com.example.ssmdemo.controller;

import com.example.ssmdemo.model.Political;
import com.example.ssmdemo.model.User;
import com.example.ssmdemo.service.PoliticalService;
import com.example.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserAction {

    @Autowired
    private UserService userService;

    @Autowired
    private PoliticalService politicalService;

    @RequestMapping("/user")
    public String index(){

        User user = userService.findById(1L);

        return user.toString();
    }

    @RequestMapping("/findAll")
    public String findAll(){

        return userService.findAll().toString();
    }

    @RequestMapping("/ppp")
    public String ttt(){

        Political political = politicalService.findById(1L);

        return political.getName();
    }

}
