package com.yc.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 10:35
 */

@Api("页面跳转控制器")
@RequestMapping(value = "/")
@Controller
public class HtmlController {


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

}

