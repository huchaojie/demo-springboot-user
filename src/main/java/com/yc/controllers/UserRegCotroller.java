package com.yc.controllers;

import com.yc.entity.Users;
import com.yc.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户信息", required = true, dataType = "Users")
    })
    @RequestMapping(value = "user_reg.action")
    public String User_reg(Users user){
        usersService.insertUser(user);
        return "login";
    }


}
