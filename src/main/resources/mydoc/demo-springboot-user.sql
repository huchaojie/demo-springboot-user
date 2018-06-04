
CREATE database stu;

--学生表
CREATE TABLE `students` (
  `sid` int(10) NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `sname` varchar(20) NOT NULL COMMENT '学生姓名',
  `sage` int(10) NOT NULL COMMENT '年龄',
  `gender` varchar(4) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;