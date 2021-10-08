package Com.sqlReview;

public class sqlTask {
    /*
    1. List all the employees' first and last name with their salary in employees table
2. how many employees have salary less than 5000?
3. how many employees have salary between 6000 and 7000?
4. List all the different region_ids in countries table
5. display the salary of the employee Grant Douglas (lastName: Grant,  firstName: Douglas)
6. display the maximum salary in employees table
7. display all informations of the employee who has the highest salary in employees table
8. display the the second maximum salary from the employees table
9. display all informations of the employee who has the second highest salary
10. display the the minimum salary in employees table
11. display all informations of the employee who has the minimum salary in employees table
12. display the second minimum salary from the employees table
13. display all informations of the employee who has the second minimum salary
14. display the average salary of the employees;
15. list all the employees who are making above the average salary;
16. list all the employees who are making less than the average salary
17. count the total numbers of the departments in departs table
18. sort the start_date in ascending order in job_history's table
19. sort the start_date in descending order in job_history's table
20. list all the employees whose first name starts with 'A'
21. list all the employees whose job_ID contains 'IT'
22. list all the employees whose department id in 50, 80, 100
-- 1.
select first_name, last_name, salary from employees;

--2.
select count(*) from employees where salary > 5000;

--3.
select count(*) from employees where salary between 6000 and 7000;

--4
select distinct region_id from countries;

--5.
select salary from employees where last_name = 'Grant' and first_name = 'Douglas';

--6.
select max(salary) from employees;

--7.
select * from employees where salary = ( select max(salary) from employees );

--8.
select max(salary) from employees where salary < ( select max(salary) from employees );

--9.
select * from employees where salary = ( select max(salary) from employees where salary<(select max(salary) from employees) );

--10.
select min(salary) from employees;

--11.
select * from employees where salary = ( select min(salary) from employees );

--12.
select min(salary) from employees where salary > ( select min(salary) from employees );

--13.
select * from employees where salaray = ( select min(salary) from employees where salary > (select min(salary) from employees) );

--14.
select avg(salary) from employees;

--15.
select * from employees where salary > ( select avg(salary) from employees );

--16.
select * from employees where salary < ( select avg(salary) from employees );

--17.
select COUNT(*) from departments;

--18.
select * from job_history order by start_date;
-- or:
select * from job_history order by start_date asc;

--19.
select * from job_history order by start_date desc;

--20.
select * from employees where first_name like 'A%';

--21.
select * from employees where job_id like '%IT%';

--22.
select * from employees where department_id in (80, 50, 100);

           SQL Practice Tasks Part 2

1. list the initials of all the employees


2. list the full names of all employees ( fullname: Lastname FirstName)


3. who has the logest name in the employees table?


4. Show all employees who work in any one of these department id  90, 60, 100, 130, 120


5. Show all employees who does not work in any one of these department id 90, 60,  100, 130, 120

6. divide employees into groups by using thier job id

6.1 display the maximum salaries in each groups
6.2 display the minium salaries in each groups
6.3 display the average salary of each group
6.4 how many employees are there in each group that have minimum salary of 5000 ?
6.5 display the total budgests of each groups



7. display employees' full email addresses and full names

(assume that the domain of the email is @gmail)



8. display full addresses from locations table

(full address: Street_Addtess,  CityName  ZipCode,  Country_id)

          Part 2 Solutions
--1
select substr(first_name, 0, 1)||substr(last_name,0,1) as "Initials" from employees;

--2.
select first_name||' '||last_name as "Full Name" from employees;


--3
select * from employees where length(first_name||' '||last_name) =
( select max( length(first_name||' '||last_name)) from employees );

--4
select * from employees where department_id in (90,60, 100, 130, 120);

--5
select * from employees where department_id not in (90,60, 100, 130, 120);


--6
select job_id from employees group by job_id;

--6.1
select job_id, max(salary) from employees group by job_id;

--6.2
select job_id, min(salary) from employees group by job_id;

--6.3
select job_id, avg(salary) from employees group by job_id;

--6.4
select job_id, count(*) from employees where salary >= 5000 group by job_id;

--6.5
select job_id, sum(salary) from employees group by job_id ;



--7.
select concat(email, '@gmail.com') as "Email Address" from employees;

--8.
select street_address||', '||city||' '||postal_code||', '||country_id
as "Full Address" from locations;

             SQL_Practice Tasks Part 3
1. Create a table called Address

Columns :

1. address_id: Must be Unique and cannot be null
2. address: Cannot be null
3. Phone: Cannot be null

Insert the following data:
                  Adress
       | Address_id |     Address        |     phone    |
       |      5     | 1913 Hanoi Way     |  28303384   |
       |      7     | 692 Joliet Street  |  44847719  |
       |      8     | 1566 Inegl Manor  |  70581400   |
       |      10    | 1795 Santiago     |  86045262  |
       |      11    | 900 Santiago      |  16571220  |

       2. Create a table called Customers

Columns:

1. Customer_Id: Must be Unique and cannot be null
2. FirstName: cannot be null
3. LastName: cannot be null
4. Address_Id: is Address table' primary key

Insert the following data:

                          Customers
             | Customer_Id | FirstName   | LastName   |  Address_Id |
             |      1      | Mary        | Smith      |     5       |
             |      2      | Patricia    | Johnson    |   null      |
             |      3      | Linda       |  Williams  |    7        |
             |      4      | Barbara     |  John      |     8       |
             |      5      | Elizabeth   |  Brown     |     null    |

Part 3 Solutions
CREATE TABLE address(

address_id Integer PRIMARY KEY,
address VARCHAR(50) NOT NULL,
phone Integer NOT NULL

);

INSERT INTO address (address_id, address, phone) VALUES (5,  '1913 Hanoi Way'  ,  28303384);
INSERT INTO address (address_id, address, phone) VALUES (7,  '692 Joliet Street'  ,  44847719);
INSERT INTO address (address_id, address, phone) VALUES (8,  '1566 Inegl Manor'  ,  70581400);
INSERT INTO address (address_id, address, phone) VALUES (10,  '1795 Santiago '  ,  86045262);
INSERT INTO address (address_id, address, phone) VALUES (11,  '900 Santiago '  ,  16571220);


CREATE TABLE customer(

customer_id Integer PRIMARY KEY,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50)NOT NULL,
address_id Integer REFERENCES address(address_id)

);


INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (1, 'Mary' ,  'Smith',  5);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (2,  'Patricia' ,  'Johnson' ,  NULl);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (3,  'Linda' ,  'Williams' ,  7);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (4, 'Barbara' ,  'Jones' , 8);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (5,  'Elizabeth' ,  'Brown' ,  NULL);


commit work;

SQL_Practice Tasks Part 4


1. Show all job_id and average salary who work as any of these jobs IT_PROG, SA_REP, FI_ACCOUNT, AD_VP

2. Show all records whose last name contains 2 lowercase 'a's

3. Display max salary  for each department

4. Display total salary for each department except department_id 50, and where total salary >30000

5. Write a SQL query that returns first and last name any employees who started job between 1-JAN-2000 and 3-SEP-2007 from the hr database

6. Display country_id, country name, region id, region name from hr database

7. Display All cities, country names from hr database

8. display the first name, last name, department number, and department name,  for all employees for departments 80 or 40.

9. Display employees' first name, Lastname department id and all departments including those where do not have any employee.

10. Display the first name, last name, department number, and name, for all employees who have or have not any department

11. Display all employee and their manager's names

Part 4 Solutions
1. select job_id, avg(salary) as "average salary" from employees group by job_id
having job_id IN ('IT_PROG', 'SA_REP', 'FI_ACCOUNT', 'AD_VP');



2. select * from employees where last_name LIKE '%a%a%';



3. select max(salary), job_id from employees group by job_id;



4. select department_id, sum(salary) from employees group by department_id
having sum(salary) > 30000 and department_id != 50;



5. select first_name, last_name from employees
where hire_date between '01-JAN-2000' and '03-SEP-2007';



6. select c.country_id, c.country_name, c.region_id, r.region_name
from countries c inner join regions r on c.region_id=r.region_id;



7. select l.city, c.country_name from countries c
inner join locations l on c.country_id=l.country_id;



8. select e.first_name, e.last_name, e.department_id, d.department_name
from employees e inner join departments d
on e.department_id=d.department_id where e.department_id in (80,40);



9. select e.first_name, e.last_name, e.department_id, d.department_name
from departments d left outer join employees e on d.department_id=e.department_id;



10. select e.first_name, e.last_name, e.department_id, d.department_name
from departments d right outer join employees e ON d.department_id=e.department_id;



11. select e1.first_name||' '|| e1.last_name as "Employee Name", e2.first_name||' '||e2.last_name as "Manager Name"
from employees e1 join employees e2 on e1.manager_id=e2.employee_id;

SQL_Practice Tasks Part 5
1. find the 3rd maximum salary from the employees table (do not include duplicates)

2. find the 5th maximum salary from the employees table (do not include duplicates)

3. find the 7th maximum salary from the employees table (do not include duplicates)

4. find the 10th maximum salary from the employees table (do not include duplicates)

5. find the 3rd minimum salary from the employees table (do not include duplicates)

6. find the 5th minimum salary from the employees table (do not include duplicates)

7. find the 7th maximum salary from the employees table (do not include duplicates)

8. find the 10th maximum salary from the employees table (do not include duplicates)
Part 5 Solutions
1. select min(salary) from (select distinct salary from employees order by salary desc) where rownum < 4;

2. select min(salary) from (select distinct salary from employees order by salary desc) where rownum < 6;

3. select min(salary) from (select distinct salary from employees order by salary desc) where rownum < 8;

4. select min(salary) from (select distinct salary from employees order by salary desc) where rownum < 11;


5. select max(salary) from (select distinct salary from employees order by salary asc) where rownum < 4;

6. select max(salary) from (select distinct salary from employees order by salary asc) where rownum < 6;

7. select max(salary) from (select distinct salary from employees order by salary asc) where rownum < 8;

8. select max(salary) from (select distinct salary from employees order by salary asc) where rownum < 11;

     */
}
