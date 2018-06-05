package com.yc.service;

import com.yc.entity.Students;
import org.springframework.stereotype.Repository;

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
    List<Students> functionAll(Students students);
}
