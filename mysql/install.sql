--    demo 脚本 ddl
drop table user;
create table user
(
	user_id bigint unsigned auto_increment comment '帐号的id' primary key,
	user_name varchar(64) not null comment '用户的姓名',
	status tinyint default '0' not null comment '用户状态 0 正常 1停用',
	email varchar(64) null comment '用户的邮箱 邮箱的规则',
	phone varchar(18) null comment '用户的手机 手机的规则',
	description varchar(512) null comment '描述信息',
	department_name varchar(64) null comment '所在部门名称',
	gmt_create datetime null comment '创建时间',
	gmt_modified datetime null comment '更新时间'
)
comment '用户常用信息' engine=innodb default charset=utf8mb4 collate=utf8mb4_bin;

--    demo 脚本 dml

delete from user where user_id = 1;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (1, '张孝全', 0, 'zhang@xiao.quan', '18918918189', '张孝全的信息', '张孝全的部门', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 2;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (2, '李大宝', 0, 'li@da.bao', '18918918188', '李大宝的信息', '李大宝的部门', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 3;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (3, '宋江', 0, 'song@jiang.com', '18918918187', '宋江的信息', '交椅部', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 4;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (4, '孔慈', 0, 'kong@126.com', '18918918186', '孔慈的信息', '孔慈的部门', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 5;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (5, '何如是', 0, 'he@ru.com', '18918918185', '何如是的信息', '何如是的部门', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 6;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (6, '王庆祥', 0, 'wang@wang.wang', '18918918184', '王庆祥的信息', '国民部', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 7;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (7, '诸葛元朗', 0, 'zhuge@zhu.ge', '13318918189', '诸葛元朗的信息', '诸葛元朗的部门', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 8;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (8, '爱木提买买提', 0, 'mai@maimai.mai', '13218918189', '爱木提买买提的信息', '爱木提买买提的部门', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 9;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (9, '常凯申', 0, 'jiang@jieshi.com', '13118918189', '常凯申的信息', '国民部', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 10;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (10, '周兴勇', 0, 'xingyong_zhou@126.com', '13618918189', '周兴勇的信息', '国民部', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 11;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (11, '韩大', 0, 'han@da.com', '13918918189', '韩大的信息', '韩大的部门', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
delete from user where user_id = 12;
INSERT INTO user (user_id, user_name, status, email, phone, description, department_name, gmt_create, gmt_modified) VALUES (12, '杨赫', 0, 'yang@126.com', '13613613189', '杨赫的信息', '国民部', '2019-04-01 07:56:51', '2019-04-01 07:56:54');
