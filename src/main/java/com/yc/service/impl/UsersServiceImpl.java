package com.yc.service.impl;

import com.yc.dao.BaseDao;
import com.yc.entity.Users;
import com.yc.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 15:46
 */

@Service
public class UsersServiceImpl implements UsersService {


    private BaseDao baseDao;

    @Resource(name = "baseDaoImpl")
    public void setBaseDao(BaseDao baseDao){
      this.baseDao=baseDao;
    }

    @Override
    public int insertUser(Users user) {
       int i= this.baseDao.add(user,"insertUser");
       return i;

    }
}
