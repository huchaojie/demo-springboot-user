package com.yc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Users implements Serializable{
    private static final long serialVersionUID = -5672032970916393908L;

    /**
     *老师id
     */
    private Integer id;

    /**
     *老师名字
     */
    private String name;

    /**
     *老师密码
     */
    private String password;

    /**
     *老师手机
     */
    private Integer phone;

    /**
     *老师年龄
     */
    private Integer age;

    /**
     *老师性别
     */
    private String sex;

    /**
     *老师邮箱
     */
    private String email;

   public Users(){

    }

    public String getName() {
        return name;
    }
}