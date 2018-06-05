
CREATE database stu;

CREATE TABLE `students` (
  `sid` int(10) NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `sname` varchar(20) NOT NULL COMMENT '学生姓名',
  `sage` int(10) NOT NULL COMMENT '年龄',
  `gender` varchar(4) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`sid`)
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
