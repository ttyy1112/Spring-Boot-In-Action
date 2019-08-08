CREATE TABLE `demo_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(20) NOT NULL DEFAULT '' COMMENT '编码',
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '名字',
  `birthday` date NOT NULL COMMENT '生日',
  `sex` tinyint(4) NOT NULL COMMENT '性别',
  `demo` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_user` varchar(20) NOT NULL DEFAULT '' COMMENT '创建用户',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_user` varchar(20) DEFAULT NULL COMMENT '更新用户',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  `dr` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除标识位。0：未删除；1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';