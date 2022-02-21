show databases;
create database jdbcTest;
use jdbcTest;

CREATE TABLE Test (
  Id int primary key,
  Name varchar(30)
  
);


insert into Test  Values
(1 , "Pankaj") ,
(2,"Sanjay"),
(3 ,"Vijay");