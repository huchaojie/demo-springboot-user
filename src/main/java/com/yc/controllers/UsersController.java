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

        if(user.getName()==null&&user.getPassword()==null){
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

//    @ApiOperation(value = "添加数据")
//    @RequestMapping(value="/insertUser.action",method = RequestMethod.POST)
//    public @ResponseBody String  insertUser(Users user) {
//        usersService.insertUser(user);
//        return "index";
//    }

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
    public @ResponseBody int updataUser(int id,String userName,String password) {
        String passwords=Encrypt.md5AndSha(password);
        Users user=new Users(id,userName,passwords);
        int result=usersService.update(user);
        return result;
    }

    @ApiOperation(value = "获取某一个用户")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "int")
    @RequestMapping(value= "/findById.action",method=RequestMethod.POST)
    public @ResponseBody Users findById(int id) {
        Users user=usersService.findById(id);
        return user;
    }
}
