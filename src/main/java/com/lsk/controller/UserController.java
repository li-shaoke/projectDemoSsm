package com.lsk.controller;

import com.alibaba.fastjson.JSON;
import com.lsk.domain.User;
import com.lsk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lsk10238 on 2017/10/31.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getallinfo")
    public  @ResponseBody Object GetAllUserInfo(){
        List<User> listUser=userService.getUsers(1);
        return JSON.toJSONString(listUser);
    }
}
