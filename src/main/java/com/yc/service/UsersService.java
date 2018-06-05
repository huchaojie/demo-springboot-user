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
     * 插入一条
     * @param user
     */
    int insertUser(Users user);

    /**
     * 删除
     * @param id
     */
    int deleteById(int id);

    /**
     * 更新
     * @param user
     */
    int update(Users user);

    /**
     * 查找
     * @param id
     * @return
     */
    Users findById(int id);
}
