package com.yc.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 10:35
 */

@Api("页面跳转控制器")
@RequestMapping("/")
@Controller
public class HtmlController {

    @ApiOperation(value = "登录页面")
    @RequestMapping(value="login.action")
    public String login() {
        return "login";
    }


    @ApiOperation(value = "进入注册页面 跳转到reg.html")
    @RequestMapping(value = "reg.action")
    public String reg(){
        return "reg";
    }

    @ApiOperation(value = "进入页面 跳转到login.html")
    @RequestMapping(value = "According.action")
    public String moba(){
        return "login";
    }

    @ApiOperation(value = "进入登录页面 跳转到login.html")
    @RequestMapping(value = "loginUser.action")
    public String mobaUers(){
        return "According";
    }

    @ApiOperation(value = "进入添加页面 跳转到main.html")
    @RequestMapping(value = "main.action")
    public String main(){
        return "main";
    }

    @ApiOperation(value = "进入显示页面 跳转到UpdataStu.html")
    @RequestMapping(value = "funselectA.action")
    public String funselectA(int id , HttpSession session){
        session.setAttribute("id",id);
        return "updataStu";
    }

}

