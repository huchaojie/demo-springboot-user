
CREATE database test;

/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-06-04 11:17:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `sid` int(11) NOT NULL COMMENT '学生ID',
  `sname` varchar(255) NOT NULL COMMENT '学生姓名',
  `sage` int(11) NOT NULL COMMENT '学生年龄',
  `gender` varchar(255) NOT NULL COMMENT '学生性别',
  `grade_class` varchar(255) NOT NULL COMMENT '学生班级',
  PRIMARY KEY (`sid`),
  CONSTRAINT `id` FOREIGN KEY (`sid`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of students
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户Id',
  `name` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '登录密码',
  `mobile_phone` int(11) NOT NULL COMMENT '手机号码',
  `age` int(11) NOT NULL COMMENT '年龄',
  `sex` varchar(255) NOT NULL COMMENT '性别',
  `email` varchar(255) NOT NULL COMMENT '电子邮件',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into users ( name, password,mobile_phone, age, sex,email) values
      ("a","a",12,18,"男","163@qq.com")
-- ----------------------------
-- Records of users
-- ----------------------------
