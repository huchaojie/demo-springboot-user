package com.yc.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 10:35
 */

@Api(value = "页面跳转控制器")
@Controller
public class HtmlController {
    @ApiOperation(value = "登录页面")
    @RequestMapping(value={"","/","login"})
    public String login() {
        return "login.html";
    }

    @ApiOperation(value = "main页面")
    @RequestMapping(value={"","/","main"})
    public String save() {
        return "main.html";
    }
}

