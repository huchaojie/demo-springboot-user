package com.yc.service;

import com.yc.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * 用户接口
 * @author 何翔
 * @date 2018/6/4
 */
@Repository
public interface UsersService {
    /**
     * 根据用户密码查询用户，用于登录
     * @param users
     */
    Users login(Users users);

    /**
     * 注册
     * @param users
     * @return
     */
    int reg(Users users);
    /**
     * 添加用户
     * @param users
     * @return
     */
    int save(Users users);

    /**
     * 添加
     * @param users
     * @return
     */
    int add(Users users);
    /**
     * 删除
     * @param id
     */
    int deleteById(int id);

    /**
     * 更新
     * @param users
     */
    int update(Users users);

    /**
     * 修改
     * @param users
     * @return
     */
    int updates(Users users);
    /**
     * 查找
     * @param id
     * @return
     */
    Users fingById(int id);
import com.yc.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * 功能接口
 * @Author: 胡超结
 * @Date: 2018/6/4 15:43
 */
@Repository
public interface UsersService {

    /**
     * 插入一条
     * @param user
     */
    public int insertUser(Users user);
}
