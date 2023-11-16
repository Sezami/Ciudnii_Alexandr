CREATE TABLE departments (
    department_id serial PRIMARY KEY,
    department_name VARCHAR(50) not null
);
insert into departments (department_name)
values
('IT'),
('HR'),
('Financial');

select *
from departments;

CREATE TABLE employees (
    employee_id serial PRIMARY KEY,
    employee_name VARCHAR(50)not null,
    department_id INT not null,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);
insert into employees(employee_name, department_id)
values
('Alice Johnson',1),
('Michael Smith',1),
('Emily Williams',2),
('Sophia Brown',3),
('Liam Davis',1),
('Olivia Wilson',1),
('Ethan Martinez',2),
('Ava Anderson',3);

select *
from employees;

CREATE TABLE projects (
    project_id serial PRIMARY KEY,
    project_name VARCHAR(50)not null
);
insert into projects(project_name)
values
('Phoenix Rising'),
('Quantum Quest');
select *
from projects;

CREATE TABLE employee_projects (
    employee_id INT not null,
    project_id INT not null,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY (project_id) REFERENCES projects(project_id)
);
insert into employee_projects(employee_id, project_id)
values
(1,1),
(2,1),
(3,1),
(4,1),
(5,2),
(6,2),
(7,2),
(8,2);
select *
from employee_projects;

select *
from employees emp
inner join departments dep on emp.department_id = dep.department_id ;

select employee_name,
from employees emp
inner join departments dep on emp.department_id = dep.department_id
where dep.department_name is null ;

select project_name, employee_name
from projects proj
inner join employee_projects emppro on emppro.project_id = proj.project_id
inner join employees emp on emppro.employee_id = emp.employee_id;

select employee_name, department_name
from employees emp
inner join departments dep on dep.department_id = emp.department_id;

select department_name, count(employee_id) as total_employees
from departments dep
inner join employees emp on dep.department_id = emp.department_id
group by dep.department_name ;
