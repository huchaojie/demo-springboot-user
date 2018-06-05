package com.yc.service.impl;

import com.yc.dao.BaseDao;
import com.yc.entity.Students;
import com.yc.service.StudentsService;
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
       System.out.println(list);
        return list;
    }
}
