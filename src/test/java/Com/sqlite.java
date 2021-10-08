package Com;

public class sqlite {
    /*
    1. List all the employees' first and last name with their salary in employees table
    SELECT first_name, last_name , salary FROM employees ;

2. how many employees have salary less than 5000?
SELECT COUNT(*) FROM employees WHERE salary < 5000;


3. how many employees have salary between 6000 and 7000?
SELECT COUNT(*) FROM employees WHERE salary BETWEEN 6000 AND 7000;
select count(*) from employees where salary between 6000 and 7000;

4. List all the different region_ids in countries table
SELECT DISTNICT region_id FROM countries;
select distinct region_id from countries;

5. display the salary of the employee Grant Douglas (lastName: Grant,  firstName: Douglas)
SELECT salary  FROM employee WHERE firstName = 'Doulaas' AND lastName = 'Grant';
select salary from employees where last_name = 'Grant' and first_name = 'Douglas';

6. display the maximum salary in employees table
SELECT MAX(Salary) FROM employees;
select max(salary) from employees;

7. display all informations of the employee who has the highest salary in employees table
SELECT * FROM employee where salary =( SELECT MAX(salary) FROM employee);
select * from employees where salary = ( select max(salary) from employees);

8. display the second maximum salary from the employees table
SELECT  MAX(salary) FROM employee WHERE salary <(SELECT * MAX(salary) FROM employee );
select max(salary) from employees where salary < ( select max(salary) from employees );

9. display all informations of the employee who has the second highest salary
SELECT * FROM employees where salary = (SELECT MAX(salary) FROM employee <(SELECT * MAX(salary) FROM employee ));
select * from employees where salary = ( select max(salary) from employees where salary<(select max(salary) from employees) );

10. display the the minimum salary in employees table
SELECT  MIN(salary) FROM employee;

11. display all informations of the employee who has the minimum salary in employees table
SELECT * FROM employees WHERE salary =( MIN(salary) FROM employee);

12. display the second minimum salary from the employees table
SELECT  MIN(salary) FROM employee >(SELECT * MIN(salary) FROM employee );

13. display all informations of the employee who has the second minimum salary
SELECT * FROM employee WHERE salary=( SELECT MIN(salary) FROM employee WHERE salary > (SELECT MIN(salary) FROM employee ));
select * from employees where salaray = ( select min(salary) from employees where salary > (select min(salary) from employees) );
14. display the average salary of the employees;
SELECT AVE(salary) FROM employees;
select avg(salary) from employees;

15. list all the employees who are making above the average salary;
SELECT * FROM employees where salary > (SELECT AVE(salary) FROM employee) ;
select * from employees where salary > ( select avg(salary) from employees );


16. list all the employees who are making less than the average salary
SELECT * FROM employees where salary < (SELECT AVE(salary) FROM employees);
select * from employees where salary < ( select avg(salary) from employees );

17. count the total numbers of the departments in departs table
SELECT COUNT(*) FROM departments;
select COUNT(*) from departments;

18. sort the start_date in ascending order in job_history's table
SELECT * FROM job_history ORDER BY start_date;
select * from job_history order by start_date;

19. sort the start_date in descending order in job_history's table
SELECT * FROM job_history ORDER BY start_date DESC;


20. list all the employees whose first name starts with 'A'
SELECT * FROM employees WHERE fist_name LIKE 'a%';
select * from employees where first_name like 'A%';

21. list all the employees whose job_ID contains 'IT'
SELECT * FROM employees WHERE job_ID LIKE '%IT%';
select * from employees where job_id like '%IT%';

22. list all the employees whose department id in 50, 80, 100
SELECT * From employees WHERE department_id in (50,80,100);
select * from employees where department_id in (80, 50, 100);

1. list the initials of all the employees
SELECT SUBSTR(last_name,0,1) AS 'INITIAL" From employees;


2. list the full names of all employees ( fullname: Lastname FirstName)
SELECT


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


     */
}
