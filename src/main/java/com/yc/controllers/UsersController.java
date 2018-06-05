package com.yc.controllers;

import com.yc.entity.Users;
import com.yc.service.UsersService;
import com.yc.util.Encrypt;
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
import javax.servlet.http.HttpServletRequest;

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
            @ApiImplicitParam(name = "users",value = "登录用户信息",required = true,dataType = "Users"),
            @ApiImplicitParam(name = "request", value = "请求", required = true, dataType = "HttpServletRequest"),
            @ApiImplicitParam(name = "model", value = "模型", required = false, dataType = "Model")
    })
    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, Users users,Model model){
        users = usersService.login(users);
        return "index";
    }

    @ApiOperation(value = "添加数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "users",value = "登录用户信息",required = true,dataType = "Users")
    })
    @RequestMapping(value="/save.action",method = RequestMethod.POST)
    public @ResponseBody void  addUser(HttpServletRequest request,Users users) {
        usersService.save(users);
    }

    @ApiOperation(value = "删除数据")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "int")
    @RequestMapping(value = "/removeUser.action",method = RequestMethod.POST)
    public @ResponseBody int removeUser(int id){
        int result=usersService.deleteById(id);
        return result;
    }
    @ApiOperation(value = "修改数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "int"),
            @ApiImplicitParam(name = "userName", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String")
    })
    @RequestMapping(value= "/updateUser.action",method= RequestMethod.POST)
    public @ResponseBody int updataUser(int id,String name,String password) {
        String passwords= Encrypt.md5AndSha(password);
        Users user=new Users(id,name,passwords);
        int result=usersService.update(user);
        return result;
    }
    @ApiOperation(value = "获取某一个用户")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "int")
    @RequestMapping(value= "/findById.action",method=RequestMethod.POST)
    public @ResponseBody Users findById(int id) {
        Users user=usersService.fingById(id);
        return user;
    }
}
