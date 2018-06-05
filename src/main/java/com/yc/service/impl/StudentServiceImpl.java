package com.yc.service.impl;

import com.yc.dao.BaseDao;
import com.yc.entity.Student;
import com.yc.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 20:28
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Resource(name="baseDaoImpl")
    private BaseDao baseDao;

    @Override
    public List<Student> functionAll(Student student) {
        List<Student> list=new ArrayList<Student>();
       list= baseDao.findAll(student,"functionAll");
        return list;
    }

    @Override
    public void deleteStu(Student student) {
        baseDao.delete(student,"deleteStu");
    }

    @Override
    public void updateStu(Student student) {
        baseDao.update(student,"updateStu");
    }

    @Override
    public void insertStu(Student student) {

        baseDao.add(student,"insertStu");
    }
}
