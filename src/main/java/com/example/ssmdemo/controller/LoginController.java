package com.example.ssmdemo.controller;

import com.example.ssmdemo.model.Admin;
import com.example.ssmdemo.model.User;
import com.example.ssmdemo.service.AdminService;
import com.example.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/userlist")
    public ModelAndView userlist(){
        List<User> users = userService.findAll();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userlist");
        mav.addObject("user",new User());
        mav.addObject("users",users);
        return mav;
    }

    @RequestMapping("/addUser")
    public String addUser(){
        return "addUser";
    }

    @RequestMapping("/addUserEvent")
    public String addUserEvent(String account,int age, String creater){
        User user = new User();
        user.setUsername(account);
        user.setAge(age);
        user.setCreater(creater);
        userService.create(user);
        return "userlist";
    }


    @RequestMapping("/userLogin")
    public String userLogin(String account, String password){
        List<User> users = userService.findAll();
        for(User user : users){
            if(user.getUsername().equals(account))
                return "/index";
        }
        List<Admin> admins = adminService.findAll();
        for (Admin admin : admins){
            if(admin.getAccount().equals(account)&&admin.getPwd().equals(password)){
                return "/userlist";
            }
        }
        return "/loginfaild";
    }

    @RequestMapping("/userRegister")
    private String userRegister(String account, String password){

        return null;
    }
}
