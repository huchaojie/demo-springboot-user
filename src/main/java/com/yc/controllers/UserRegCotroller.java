package com.yc.controllers;

import com.yc.entity.Users;
import com.yc.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 10:35
 */
@Api("注册")
@Controller
public class UserRegCotroller {

    @Resource(name= "usersServiceImpl")
    private UsersService usersService;

    @ApiOperation(value = "注册")
    @RequestMapping(value = "/insertUser.action",method = RequestMethod.POST)
    public void insertUser(Users user){
        usersService.insertUser(user);
    }


}
