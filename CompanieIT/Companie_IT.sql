drop database if exists It_company;
create database IT_company;

use IT_company;

create table departments(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
department_name varchar(50) NOT NULL,
floor INT NOT NULL,
number_of_employees INT NOT NULL,
name_director_department varchar(50) NOT NULL
);

create table employees(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name varchar (15) NOT NULL,
surname varchar(15) NOT NULL,
adress varchar(50) NOT NULL,
age INT NOT NULL,
job_position varchar(50) NOT NULL,
department_name varchar(50)
);

create table products(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
product_name varchar(50) NOT NULL,
version varchar(50) NOT NULL,
number_of_clients INT NOT NULL,
price INT NOT NULL
);

insert into departments
(department_name, floor, number_of_employees, name_director_department)
values
('Finance department', 2, 5, 'Cujba Alexandru');

insert into departments
(department_name, floor, number_of_employees, name_director_department)
values
('Production department', 3, 7, 'Chirea Alin');

insert into departments
(department_name, floor, number_of_employees, name_director_department)
values
('Sales department', 1, 8, 'Gorovei Alina');

insert into departments
(department_name, floor, number_of_employees, name_director_department)
values
('HR department', 2, 6, 'Buza Alexandra');

insert into employees
(name, surname, adress, age, job_position, department_name)
values
('Ilie', 'Cristian', 'Galati, Str. Molidului', 27, 'software tester', 'Production department');

insert into employees
(name, surname, adress, age, job_position, department_name)
values
('Ioan', 'Roxana', 'Galati, Micro 20', 26, 'manager human resources', 'HR department');

insert into employees
(name, surname, adress, age, job_position, department_name)
values
('Nastase', 'Eduard', 'Galati, Tiglina I', 31, 'financial manager', 'Finance department');









