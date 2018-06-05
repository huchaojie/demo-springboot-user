package com.yc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Users implements Serializable{
    private static final long serialVersionUID = -5672032970916393908L;


    private Integer id;

    private String name;

    private String password;

    private Integer Mobile_Phone;

    private Integer age;

    private String sex;

    private String email;

   public Users(){

    }


}