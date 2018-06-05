package com.yc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 胡超结
 * @Date: 2018/6/4 20:44
 */

@Data
public class Students implements Serializable{
    private static final long serialVersionUID = 1165394640980547769L;
    /**
     *学生id
     */
    private Integer sid;

    /**
     *学生名字
     */
    private String sname;

    /**
     *学生年龄
     */
    private Integer sage;

    /**
     *学生性别
     */
    private String gender;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}