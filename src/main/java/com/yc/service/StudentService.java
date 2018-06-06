package com.yc.service;

import com.yc.entity.Student;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 20:28
 */

@Repository
public interface StudentService {

    /**
     * 查询所有
     * @param students
     * @return
     */
    public List<Student> functionAll(Student students);

    /**
     * 删除
     * @param students
     */
    public void  deleteStu(Student students);

    /**
     * 更新
     * @param students
     */
    public void updateStu(Student students);

    /**
     * 添加
     * @param students
     */
    public void insertStu(Student students);
}
