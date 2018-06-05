package com.yc.service.impl;

import com.yc.dao.BaseDao;
import com.yc.entity.Users;
import com.yc.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户业务
 * @author 何翔
 * @date 2018/6/4
 */
@Service
public class UsersServiceImpl implements UsersService{
    private BaseDao baseDao;

    @Resource(name = "baseDaoImpl")
    public void setBaseDao(BaseDao baseDao){
        this.baseDao = baseDao;
    }

    /**
     * 登录
     * @param user
     * @return
     */
    @Override
    public Users login(Users user) {
        List<Users> list = this.baseDao.findAll(user, "login");
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    /**
     * 插入一条数据
     * @param user
     * @return
     */
    @Override
    public int insertUser(Users user) {
       int i= this.baseDao.add(user,"insertUser");
       return i;

    }

    @Override
    public int deleteById(int id) {
        Users user=new Users();
        user.setId(id);
        int result=this.baseDao.delete(user, "deleteById");
        return result;
    }

    @Override
    public int update(Users user) {
        int result=this.baseDao.update(user, "update");
        return result;
    }

    @Override
    public Users findById(int id) {
        Users user=new Users();
        user.setId(id);
        List<Users>list=this.baseDao.findAll(user, "findById");
        return list.get(id);
    }
}
