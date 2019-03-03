--初始化数据库sql

--创建数据库，设置编码格式utf8
create database 'hikaricptest' character set 'utf8';
--打开数据库
use hikaricptest;
--创建用户信息表
create table 'hikaricptest'.'userinfo'(
  'id' int(0) not null,
  'username' varchar(255) null,
  primary key ('id')
);
--给用户信息表添加test数据
insert into userinfo(id,username) values (0,'csdnjinzheyi');
insert into userinfo(id,username) values (1,'csdn');
insert into userinfo(id,username) values (2,'jinzheyi');
