package com.yc.controllers;

import com.yc.entity.Student;

import com.yc.service.StudentService;
import com.yc.util.JsonMode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 20:44
 */
@Api("学生管理")
@Controller
public class StudentCotroller {

    @Resource(name= "studentServiceImpl")
    private StudentService studentService;


    @ApiOperation(value = "查询所有学生")
    @RequestMapping(value = "funStuAll.action")
    @ResponseBody
    public JsonMode funAll(JsonMode jsonMode){
        Student st=new Student();
        List<Student> list=new ArrayList<Student>();
        list= studentService.functionAll(st);
        jsonMode.setObj(list);
        jsonMode.setCode(1);
        return jsonMode;
    }

    @ApiOperation(value = "删除学生")
    @RequestMapping(value = "deltStu.action")
    @ResponseBody
    public JsonMode delstu(JsonMode jsonMode,int id){
        Student stu=new Student();
        stu.setSid(id);
            studentService.deleteStu(stu);
            jsonMode.setCode(1);
        return jsonMode;
    }
    @ApiOperation(value = "修改学生")
    @RequestMapping(value = "updateAstu.action")
    @ResponseBody
    public JsonMode updatastu(JsonMode jsonMode, HttpSession session){
        Integer id=(Integer) session.getAttribute("id");
        Student st=new Student();
        st.setSid(id);
        List<Student> list=new ArrayList<Student>();
        list= studentService.functionAll(st);
        jsonMode.setObj(list);
        return jsonMode;
    }

    @RequestMapping(value = "updateStuden.action")
    @ResponseBody
    public JsonMode updatastuden(JsonMode jsonMode, HttpSession session,Student st){
        Integer id=(Integer) session.getAttribute("id");
        st.setSid(id);
        studentService.updateStu(st);
        jsonMode.setCode(1);
        return jsonMode;
    }

}
