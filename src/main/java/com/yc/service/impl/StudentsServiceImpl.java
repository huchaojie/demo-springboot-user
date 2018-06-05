package com.yc.service.impl;

import com.yc.dao.BaseDao;
import com.yc.entity.Students;
import com.yc.service.StudentsService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 20:28
 */

@Service
public class StudentsServiceImpl implements StudentsService{

    @Resource(name="baseDaoImpl")
    private BaseDao baseDao;

    @Override
    public List<Students> functionAll(Students students) {
        List<Students> list=new ArrayList<Students>();
       list= baseDao.findAll(students,"functionAll");
        return list;
    }

    @Override
    public void deleteStu(Students students) {
        baseDao.delete(students,"deleteStu");
    }

    @Override
    public void updateStu(Students students) {
        baseDao.update(students,"updateStu");
    }

    @Override
    public void insertStu(Students students) {

        baseDao.add(students,"insertStu");
    }
}
