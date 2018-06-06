package com.yc.controllers;

import com.yc.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 10:35
 */

@Api("页面跳转控制器")
@RequestMapping(value = "/")
@Controller
public class HtmlController {



    @ApiOperation(value = "主页面")
    @RequestMapping(value={"","/","login"})
    public String login() {
        return "index";
    }


    @ApiOperation(value = "进入注册页面 跳转到reg.html")
    @RequestMapping(value = "reg.action")
    public String reg(){
        return "reg";
    }

    @ApiOperation(value = "进入登录页面 跳转到login.html")
    @RequestMapping(value = "login.action")
    public String moba(){
        return "login";
    }

    @ApiOperation(value = "进入登录页面 跳转到login.html")
    @RequestMapping(value = "loginUser.action")
    public String mobaUers(){
        return "According";
    }

    @ApiOperation(value = "进入登录页面 跳转到login.html")
    @RequestMapping(value = "main")
    public String main(){
        return "main";
    }

    @ApiOperation(value = "进入显示页面 跳转到UpdataStu.html")
    @RequestMapping(value = "updatestu.action")
    public String updataStu(int id , HttpSession session){
        session.setAttribute("id",id);
        return "updataStu";
    }

}

