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
     * 注册
     * @param users
     * @return
     */
    @Override
    public int reg(Users users) {
        int i= this.baseDao.add(users,"reg");
        return i;
    }

    /**
     * 添加
     * @param users
     * @return
     */
    @Override
    public int save(Users users) {
        int i= this.baseDao.add(users,"save");
        return i;
    }

    /**
     * 添加
     * @param users
     * @return
     */
    @Override
    public int add(Users users) {
        int i=this.baseDao.add(users,"add");
        return i;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public int deleteById(int id) {
        Users users=new Users();
        users.setId(id);
        int result = this.baseDao.delete(users,"deleteById");
        return result;
    }

    /**
     * 修改
     * @param users
     * @return
     */
    @Override
    public int update(Users users) {
        int result = this.baseDao.update(users,"update");
        return result;
    }

    /**
     * 修改
     * @param users
     * @return
     */
    @Override
    public int updates(Users users) {
        int result = this.baseDao.update(users,"updates");
        return result;
    }

    /**
     * 查询
     * @param id
     * @return
     */
    @Override
    public Users fingById(int id) {
        Users users=new Users();
        users.setId(id);
        List<Users>list=this.baseDao.findAll(users, "findById");
        return list.get(0);
    }
}
