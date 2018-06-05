package com.yc.service;

import com.yc.entity.Students;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 20:28
 */

@Repository
public interface StudentsService {

    /**
     * 查询所有
     * @param students
     * @return
     */
    public List<Students> functionAll(Students students);
}
