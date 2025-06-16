create database tuesday;
use tuesday;

create table category(
c_id int primary key,
c_name varchar(20),
c_details varchar(20)

);

insert into category values(1,'electronics','asdfgh'),
(2,'furnitures','asdfghjkl');

update category set c_id=109 where c_id=1;
start transaction;
delete from category where c_id=1;
savepoint a11;
rollback to a11;

# alter table category add check(char_length(c_name>=20));

select * from category;

drop table product;
create table product(
p_id int primary key,
p_name varchar(20),
p_details varchar(20),
c_id int,
foreign key product(c_id) references category(c_id) 
on delete cascade
 on update cascade );

select * from product;

insert into product values(501,'samsung','8GB RAM',10);


create table bikes(
c_id int primary key ,
c_name varchar(20) not null,
c_number int );

alter table bikes add unique (c_id);

alter table bikes add constraint name unique(c_id,c_name);

alter table bikes add check(c_number>20);


select * from bikes;