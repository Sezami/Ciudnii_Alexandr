create table students_info(
student_id serial primary key,
name text not null,
surname text not null,
age int not null,
sex text not null
);

select *
from students_info si ;

insert into students_info (name,surname,age,sex)
values
('Alice','Smith',20,'Female'),
('Bob','Johnson',22,'Male'),
('Charlie','Brown',19,'Male'),
('Diana','Lee',21,'Female'),
('Emily','Davis',23,'Female');
select *
from students_info;

begin transaction;
update students_info
set age = 24
where name = 'Emily' and surname = 'Davis';

select *
from students_info;

rollback;
select *
from students_info;


begin transaction;
delete from students_info
where name = 'Charlie' and surname = 'Brown';

select *
from students_info;

rollback;
select *
from students_info;

select name,age
from students_info
where sex = 'Female'

select name
from students_info
where surname like 'C%'

