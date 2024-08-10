CREATE DATABASE COMPANY

use COMPANY

Create table Employee
(
ssn int primary key not null
,first_name nvarchar(50) not null,
second_name nvarchar(50) not null,
 birth_date date not null,
address nvarchar(100) not null,
salary float not null ,
gender nvarchar (10) ,
super_ssn nvarchar (15) ,
D_number INT 
)
set dateformat dmy

Create table department
(
dnumber int primary key not null,
dname nvarchar(50) not null
,mgr_ssn int  not null,
mgr_start_date date not null
UNIQUE (Dname),
FOREIGN KEY (Mgr_ssn) REFERENCES EMPLOYEE(Ssn) 
)



create table project
(
Pnumber int primary key NOT NULL
,Pname nvarchar(50) not null,
Plocation nvarchar(50) not null
UNIQUE (Pname)
)
alter table project add Dnum int not null references department(dnumber)

CREATE TABLE DEPT_LOCATIONS
( 
Dnumber INT NOT NULL,
Dlocation NVARCHAR(50) NOT NULL,
PRIMARY KEY (Dnumber, Dlocation),
FOREIGN KEY (Dnumber) REFERENCES DEPARTMENT(Dnumber)
)

CREATE TABLE DEPENDENTT
(
Essn int NOT NULL,
Dependent_name NVARCHAR(50) NOT NULL,
Sex CHAR,
Bdate DATE,
Relationship NVARCHAR(30),
PRIMARY KEY (Essn, Dependent_name),
FOREIGN KEY (Essn) REFERENCES EMPLOYEE(Ssn)
)


CREATE TABLE WORKS_ON
(
Essn INT NOT NULL,
Pnum INT NOT NULL,
Hours float NOT NULL,
PRIMARY KEY (Essn, Pnum),
FOREIGN KEY (Essn) REFERENCES EMPLOYEE(Ssn),
FOREIGN KEY (Pnum) REFERENCES PROJECT(Pnumber) 
)
select * from Employee
select * from department
select * from project
select * from DEPT_LOCATIONS
select*from DEPENDENTT
select*from WORKS_ON
drop database COMPANY