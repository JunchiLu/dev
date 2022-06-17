/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : supplier

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 11/05/2022 21:14:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for s_category
-- ----------------------------
DROP TABLE IF EXISTS `s_category`;
CREATE TABLE `s_category` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `cate_num` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of s_category
-- ----------------------------
BEGIN;
INSERT INTO `s_category` (`id`, `name`, `cate_num`, `create_time`, `update_time`, `status`) VALUES ('35669d78-fd55-4978-b94f-14c2f32dd2e7', '零食', NULL, '2022-05-06 16:41:33', NULL, 1);
INSERT INTO `s_category` (`id`, `name`, `cate_num`, `create_time`, `update_time`, `status`) VALUES ('506c5687-1041-4747-8093-ed3eff26c3d7', '水果', NULL, '2022-05-06 11:39:23', NULL, 1);
INSERT INTO `s_category` (`id`, `name`, `cate_num`, `create_time`, `update_time`, `status`) VALUES ('f071b776-546e-443d-b947-62418158fe52', '蔬菜', NULL, '2022-05-06 16:41:26', NULL, 1);
COMMIT;

-- ----------------------------
-- Table structure for s_goods
-- ----------------------------
DROP TABLE IF EXISTS `s_goods`;
CREATE TABLE `s_goods` (
  `id` varchar(50) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `cate_id` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `prams` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of s_goods
-- ----------------------------
BEGIN;
INSERT INTO `s_goods` (`id`, `title`, `cate_id`, `price`, `prams`, `num`, `desc`, `create_time`, `update_time`) VALUES ('0e34ea40-5ae9-48cb-aa80-56b2ce3a2ad7', '苹果', NULL, 12.20, '/upload/06bedf5203384454a60c90b274256379.jpg', 19, '大苹果', '2022-05-06 11:03:09', NULL);
INSERT INTO `s_goods` (`id`, `title`, `cate_id`, `price`, `prams`, `num`, `desc`, `create_time`, `update_time`) VALUES ('eb55d5c5-1c69-4ca8-b73e-943f66d96396', '茄子', 'f071b776-546e-443d-b947-62418158fe52', 13.00, '/upload/30048f14f2c040f4ab80c81451ca8e4e.jpeg', 423, '大茄子', '2022-05-06 16:41:59', NULL);
COMMIT;

-- ----------------------------
-- Table structure for s_news
-- ----------------------------
DROP TABLE IF EXISTS `s_news`;
CREATE TABLE `s_news` (
  `id` varchar(50) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of s_news
-- ----------------------------
BEGIN;
INSERT INTO `s_news` (`id`, `title`, `content`, `create_time`, `update_time`) VALUES ('3a93eefe-68c5-4c6d-979c-6d36fe6b1777', '测试测试', '再次测试新闻', '2022-05-06 12:31:40', NULL);
INSERT INTO `s_news` (`id`, `title`, `content`, `create_time`, `update_time`) VALUES ('cb396605-48d8-413e-9b71-2ba708f3a0f1', '测试新闻123', '好好测试你这个小新闻', '2022-05-11 21:09:26', NULL);
COMMIT;

-- ----------------------------
-- Table structure for s_order
-- ----------------------------
DROP TABLE IF EXISTS `s_order`;
CREATE TABLE `s_order` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `goods_id` varchar(50) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  `total_price` decimal(10,2) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of s_order
-- ----------------------------
BEGIN;
INSERT INTO `s_order` (`id`, `user_id`, `goods_id`, `type`, `order_num`, `total_price`, `create_time`, `update_time`) VALUES ('c18bba19-e6c2-4a3c-a72e-0e7750re43d5f', 'dadafsgsgseqwd', '0e34ea40-5ae9-48cb-aa80-56b2ce3a2ad7', 3, 2, 54.60, '2022-05-06 15:45:01', NULL);
INSERT INTO `s_order` (`id`, `user_id`, `goods_id`, `type`, `order_num`, `total_price`, `create_time`, `update_time`) VALUES ('gf00ce344e8', '91ac21ea-b5b8-4779-bf1f-822da536be73', '0e34ea40-5ae9-48cb-aa80-56b2ce3a2ad7', 1, 3, 45.90, '2022-05-06 15:44:11', NULL);
COMMIT;

-- ----------------------------
-- Table structure for s_role
-- ----------------------------
DROP TABLE IF EXISTS `s_role`;
CREATE TABLE `s_role` (
  `id` varchar(50) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of s_role
-- ----------------------------
BEGIN;
INSERT INTO `s_role` (`id`, `name`, `create_time`, `update_time`, `status`) VALUES ('1', 'admin', '2022-05-05 17:54:00', NULL, 1);
INSERT INTO `s_role` (`id`, `name`, `create_time`, `update_time`, `status`) VALUES ('134171e8-4536-4a41-bc09-6a61ed2ae2e3', 'code', '2022-05-11 21:07:22', NULL, 1);
INSERT INTO `s_role` (`id`, `name`, `create_time`, `update_time`, `status`) VALUES ('2', 'manager', '2022-05-05 17:55:10', NULL, 1);
INSERT INTO `s_role` (`id`, `name`, `create_time`, `update_time`, `status`) VALUES ('3', 'employee', '2022-05-05 17:55:21', NULL, 1);
INSERT INTO `s_role` (`id`, `name`, `create_time`, `update_time`, `status`) VALUES ('3bade2cd-b965-4d0e-9006-8cbac23e2fb7', '董事长', '2022-05-11 21:06:50', NULL, 2);
COMMIT;

-- ----------------------------
-- Table structure for s_role_user
-- ----------------------------
DROP TABLE IF EXISTS `s_role_user`;
CREATE TABLE `s_role_user` (
  `id` varchar(50) NOT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `role_id` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of s_role_user
-- ----------------------------
BEGIN;
INSERT INTO `s_role_user` (`id`, `user_id`, `role_id`, `create_time`, `update_time`) VALUES ('6e539cae-35d5-4132-b573-33ddce246836', '91ac21ea-b5b8-4779-bf1f-822da536be73', '3', '2022-05-06 16:27:36', NULL);
INSERT INTO `s_role_user` (`id`, `user_id`, `role_id`, `create_time`, `update_time`) VALUES ('6fdf33c2-b7fd-4224-a43a-01dc728f18c0', 'dadafsgsgseqwd', '2', '2022-05-06 16:34:15', NULL);
INSERT INTO `s_role_user` (`id`, `user_id`, `role_id`, `create_time`, `update_time`) VALUES ('77aa0811-775f-4eb6-9963-dd57f70de9c6', 'dadafsgsgseqwd', '1', '2022-05-06 16:18:05', NULL);
INSERT INTO `s_role_user` (`id`, `user_id`, `role_id`, `create_time`, `update_time`) VALUES ('9684f54c-9456-4cd3-a135-7155f216667d', '8eeeb8d1-fee6-45e2-9bc2-9df9453d5289', '2', '2022-05-07 01:42:29', NULL);
INSERT INTO `s_role_user` (`id`, `user_id`, `role_id`, `create_time`, `update_time`) VALUES ('e733a61d-9e71-42a6-9696-fc258160dc8e', '91ac21ea-b5b8-4779-bf1f-822da536be73', '2', '2022-05-06 16:33:56', NULL);
COMMIT;

-- ----------------------------
-- Table structure for s_user
-- ----------------------------
DROP TABLE IF EXISTS `s_user`;
CREATE TABLE `s_user` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of s_user
-- ----------------------------
BEGIN;
INSERT INTO `s_user` (`id`, `username`, `password`, `salt`, `phone`, `avatar`, `email`, `nick_name`, `status`, `sex`, `create_time`, `update_time`) VALUES ('158d9167-0060-4741-a69f-40f3fabfcf04', 'admin123', 'ef5e5fe5b4a53a317aca3481e1a35e12', '43cc8d16fdf04d8a8c44', '180244256467', '/upload/fa15c241f4ec492e959c5348c4bab1b2.jpeg', 'admin123@qq.com', '测试员工', 1, 1, '2022-05-11 21:06:12', NULL);
INSERT INTO `s_user` (`id`, `username`, `password`, `salt`, `phone`, `avatar`, `email`, `nick_name`, `status`, `sex`, `create_time`, `update_time`) VALUES ('8eeeb8d1-fee6-45e2-9bc2-9df9453d5289', 'pdx11', 'a1960b93420fe706bf5b9b86a6111722', '9ebf0717117c4c3da8f8', '1234245354664', '/upload/3740eb4e04334dc990ea4fef7bd2ec7c.jpeg', 'pdx@qq.com', '派大星1号', 1, 1, '2022-05-06 17:02:00', '2022-05-07 01:37:34');
INSERT INTO `s_user` (`id`, `username`, `password`, `salt`, `phone`, `avatar`, `email`, `nick_name`, `status`, `sex`, `create_time`, `update_time`) VALUES ('91ac21ea-b5b8-4779-bf1f-822da536be73', 'lucy', '14493a301ce856534e32f4142e9115d8', '5a187e4fa83f45a5a04e', '1424535353', '/upload/601c98aaf8014a89b9add1eb2498eb8e.jpg', 'adda@qq.com', '露西', 1, 1, '2022-05-06 15:13:37', NULL);
INSERT INTO `s_user` (`id`, `username`, `password`, `salt`, `phone`, `avatar`, `email`, `nick_name`, `status`, `sex`, `create_time`, `update_time`) VALUES ('dadafsgsgseqwd', 'pdx', '4e9204927092d8697665718a7157705e', '5935bb32e26d440db447', '1424355664542', '/upload/f40d3823328f4fa5a8ac5c87d9957d4d.jpeg', '', '派大星', 1, 1, NULL, '2022-05-06 18:47:11');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
