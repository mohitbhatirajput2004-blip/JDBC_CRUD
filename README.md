# JDBC_CRUD_DATABASE_COMMAND
```SQL
create database studentmanagement;
use studentmanagement;

create table student_data (sid int primary key not null auto_increment, sname varchar(20) , sage int not null ,  saddress varchar(20));

describe student_data;

select * from student_data; ```
