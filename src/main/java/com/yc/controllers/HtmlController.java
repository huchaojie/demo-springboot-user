package com.yc.controllers;

import com.sun.deploy.net.HttpResponse;
import io.swagger.annotations.Api;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 10:35
 */

@Api("页面跳转控制器")
@RequestMapping("/")
@Controller
public class HtmlController {
    @ApiOperation(value = "登录页面")
    @RequestMapping(value={"","/","login"})
    public String login() {
        return "login.html";


    @Resource(name="studentsServiceImpl")
    private StudentsService studentsService;

    @ApiOperation(value = "进入注册页面 跳转到reg.html")
    @RequestMapping(value = "reg.action")
    public String reg(){
        return "reg";
    }


}

