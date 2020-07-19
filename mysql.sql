/*
SQLyog Ultimate v12.3.1 (64 bit)
MySQL - 5.7.26 : Database - springboot
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`springboot` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot`;

/*Table structure for table `w_log` */

DROP TABLE IF EXISTS `w_log`;

CREATE TABLE `w_log` (
  `lid` int(10) NOT NULL AUTO_INCREMENT,
  `ip` varchar(30) DEFAULT NULL,
  `url` varchar(60) DEFAULT NULL,
  `desc` varchar(50) DEFAULT NULL,
  `class_function` varchar(80) DEFAULT NULL,
  `accord_parameters` varchar(80) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `lremark` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8mb4;

/*Data for the table `w_log` */

insert  into `w_log`(`lid`,`ip`,`url`,`desc`,`class_function`,`accord_parameters`,`time`,`lremark`) values 
(16,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 12:20:06','在修改页面回显了要修改的用户信息'),
(17,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 12:22:57','在修改页面回显了要修改的用户信息'),
(18,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:17:56','用于跳转到添加页面'),
(19,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:19:41','用于跳转到添加页面'),
(20,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:20:26','用于跳转到添加页面'),
(21,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:22:12','用于跳转到添加页面'),
(22,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:28:28','用于跳转到添加页面'),
(23,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:29:57','用于跳转到添加页面'),
(24,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:30:49','用于跳转到添加页面'),
(26,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:36:15','用于跳转到添加页面'),
(27,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:37:53','用于跳转到添加页面'),
(28,'0:0:0:0:0:0:0:1','http://localhost:8080/addUser','添加用户','com.wk.controller.UserController.addUser','[userPojo, model]','2020-07-19 13:38:01','添加了一个用户'),
(29,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 13:38:30','在修改页面回显了要修改的用户信息'),
(30,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 13:41:58','在修改页面回显了要修改的用户信息'),
(31,'0:0:0:0:0:0:0:1','http://localhost:8080/upd','修改用户','com.wk.controller.UserController.upd','[userPojo, model]','2020-07-19 13:42:09','修改了一个用户'),
(32,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 13:42:12','在修改页面回显了要修改的用户信息'),
(33,'0:0:0:0:0:0:0:1','http://localhost:8080/upd','修改用户','com.wk.controller.UserController.upd','[userPojo, model]','2020-07-19 13:42:15','修改了一个用户'),
(34,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 13:42:18','在修改页面回显了要修改的用户信息'),
(35,'0:0:0:0:0:0:0:1','http://localhost:8080/upd','修改用户','com.wk.controller.UserController.upd','[userPojo, model]','2020-07-19 13:42:25','修改了一个用户'),
(36,'0:0:0:0:0:0:0:1','http://localhost:8080/add','跳转添加页面','com.wk.controller.UserController.add','无','2020-07-19 13:42:33','用于跳转到添加页面'),
(37,'0:0:0:0:0:0:0:1','http://localhost:8080/addUser','添加用户','com.wk.controller.UserController.addUser','[userPojo, model]','2020-07-19 13:42:43','添加了一个用户'),
(38,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 13:42:52','在修改页面回显了要修改的用户信息'),
(39,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 13:47:30','在修改页面回显了要修改的用户信息'),
(40,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 13:48:43','在修改页面回显了要修改的用户信息'),
(41,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 13:51:07','在修改页面回显了要修改的用户信息'),
(42,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:03:53','在修改页面回显了要修改的用户信息'),
(43,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:11:11','在修改页面回显了要修改的用户信息'),
(44,'0:0:0:0:0:0:0:1','http://localhost:8080/upd','修改用户','com.wk.controller.UserController.upd','[userPojo, model]','2020-07-19 14:11:27','修改了一个用户'),
(45,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:11:30','在修改页面回显了要修改的用户信息'),
(46,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:13:22','在修改页面回显了要修改的用户信息'),
(47,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:13:31','在修改页面回显了要修改的用户信息'),
(48,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:15:49','在修改页面回显了要修改的用户信息'),
(49,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:16:33','在修改页面回显了要修改的用户信息'),
(50,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:16:38','在修改页面回显了要修改的用户信息'),
(51,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:20:46','在修改页面回显了要修改的用户信息'),
(52,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:23:01','在修改页面回显了要修改的用户信息'),
(53,'127.0.0.1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:24:13','在修改页面回显了要修改的用户信息'),
(54,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:24:44','在修改页面回显了要修改的用户信息'),
(55,'0:0:0:0:0:0:0:1','http://localhost:8080/upd','修改用户','com.wk.controller.UserController.upd','[userPojo, model]','2020-07-19 14:24:51','修改了一个用户'),
(56,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:24:59','在修改页面回显了要修改的用户信息'),
(57,'0:0:0:0:0:0:0:1','http://localhost:8080/upd','修改用户','com.wk.controller.UserController.upd','[userPojo, model]','2020-07-19 14:25:03','修改了一个用户'),
(58,'0:0:0:0:0:0:0:1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:25:09','在修改页面回显了要修改的用户信息'),
(59,'127.0.0.1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 14:30:59','在修改页面回显了要修改的用户信息'),
(60,'127.0.0.1','http://localhost:8080/upd','修改用户','com.wk.controller.UserController.upd','[userPojo, model]','2020-07-19 14:31:05','修改了一个用户'),
(66,'127.0.0.1','http://localhost:8080/updSel','修改回显','com.wk.controller.UserController.updSel','[id, model]','2020-07-19 15:45:05','在修改页面回显了要修改的用户信息'),
(67,'127.0.0.1','http://localhost:8080/upd','修改用户','com.wk.controller.UserController.upd','[userPojo, model]','2020-07-19 15:45:29','修改了一个用户');

/*Table structure for table `w_user` */

DROP TABLE IF EXISTS `w_user`;

CREATE TABLE `w_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `uanme` varchar(20) DEFAULT NULL,
  `phoneNum` varchar(20) DEFAULT NULL,
  `idCard` varchar(40) DEFAULT NULL,
  `province` varchar(10) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `status` int(5) DEFAULT NULL,
  `creatDate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;

/*Data for the table `w_user` */

insert  into `w_user`(`id`,`uanme`,`phoneNum`,`idCard`,`province`,`city`,`email`,`remark`,`status`,`creatDate`) values 
(17,'电饭锅','213','213','双方都','双方都','1242978','阿萨',0,'2020-07-19 15:45:29');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
