package com.yc.controllers;

import com.yc.entity.Users;
import com.yc.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author 何翔
 * @date 2018/6/4
 */
@Api(value="用户控制器")
@Controller
public class UsersController {
    @Resource(name="usersServiceImpl")
    private UsersService usersService;

    @ApiOperation(value = "登入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "登录用户信息", required = true, dataType = "Users"),
            @ApiImplicitParam(name = "session", value = "会话", required = true, dataType = "HttpSession"),
            @ApiImplicitParam(name = "model", value = "模型", required = false, dataType = "Model")
    })
    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String doLogin(Users user, Model model, HttpSession session){

        if((user.getName() == null) && (user.getPassword() == null)){
            model.addAttribute("errorMsg", "用户名或密码不能为空...");
            return "login";
        }
        try {
            user = usersService.login(user);
        } catch (Exception e) {
            model.addAttribute("errorMsg", "用户名或密码错误...");
            return "login";
        }
        if (user!=null) {
            return "index";
        } else {
            model.addAttribute("errorMsg", "用户名或密码错误...");
            return "login";
        }
    }

   @ApiOperation(value = "添加数据")
   @ApiImplicitParams({
           @ApiImplicitParam(name = "user", value = "用户信息", required = true, dataType = "Users")
   })
    @RequestMapping(value="/insertUser.action",method = RequestMethod.POST)
    public @ResponseBody String  insertUser(Users user) {
       int result = usersService.insertUser(user);
        return String.valueOf(result);
    }
}
