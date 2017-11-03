# projectDemoSsm
The demo for SSM(spring+spring mvc+mybatis) automatically generate sqlmapper by mybatis

You can contact me by sending email to me, if you have a problem.
Email address is: eric_li@live.cn

when you run,
you shoud alter the file db.properties and generatorConfig.xml in the /src/main/resource directory, 
with correct username and PWD of your mySql DB

li Shaoke 
2017.11.03

The table struct:
-- ----------------------------
-- Table structure for TestUserTable
-- ----------------------------
DROP TABLE IF EXISTS `TestUserTable`;
CREATE TABLE `TestUserTable` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `UserName` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名',
  `Password` varchar(100) NOT NULL DEFAULT '' COMMENT '密码',
  `DataFlag` int(11) NOT NULL DEFAULT '0' COMMENT '有效性',
  `Remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of TestUserTable
-- ----------------------------
INSERT INTO `TestUserTable` VALUES ('2', 'aaaa', '1234', '1', 'adfwefwefwefwefwf');
INSERT INTO `TestUserTable` VALUES ('3', '123', '123', '1', '我就是123');
INSERT INTO `TestUserTable` VALUES ('4', 'admin', '123', '1', '天生管理员，哈哈哈');
INSERT INTO `TestUserTable` VALUES ('5', 'ce', 'cecece', '1', 'ceshi');
