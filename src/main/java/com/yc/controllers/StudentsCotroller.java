package com.yc.controllers;

import com.yc.entity.Students;
import com.yc.service.StudentsService;
import com.yc.util.JsonMode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 20:44
 */
@Api("学生管理")
@Controller
public class StudentsCotroller {

    @Resource(name="studentsServiceImpl")
    private StudentsService studentsService;


    @ApiOperation(value = "查询所有学生")
    @RequestMapping(value = "a.action")
    @ResponseBody
    public JsonMode login(JsonMode jsonMode){
        Students st=new Students();
        List<Students> list=new ArrayList<Students>();
        list=studentsService.functionAll(st);
        jsonMode.setObj(list);
        jsonMode.setCode(1);
        return jsonMode;
    }



}
