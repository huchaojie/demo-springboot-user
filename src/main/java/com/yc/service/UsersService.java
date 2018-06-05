package com.yc.service;

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
