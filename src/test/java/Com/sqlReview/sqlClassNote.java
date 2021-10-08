package Com.sqlReview;

public class sqlClassNote {
    /*
SQL short cuts:content assisst: control + spaceexecute query: control + EnterSelect Statement:
selects specific column(s)used for reading table and retriving data from the tablewhen
we use select statement we will have to specify the table names with from keywordSyntax:

1. select * from TableName;selects the entire columns from the table2.
select ColumName from TableName;selects specific column from the table3.
Select ColumName1, ColumName2 from TableNameselects the given columns from the table4.
select Column(s) from TableNam1, TableName2;selects the column(s) from the
given tablesDistinct Keyword: dsiplays the result of the column
without duplicationselect distinct columName from TableName;
Where clause: is used as the filter optionwe can give conditional statements by
using where clauseselect column(s) from TableName where  Conditin;
whichever matches with the given condition, will be displayed
Operators:    >, < , >=, <= , != (<>), and, orBetween statement:
used to specify the range of the conditionselect columns from Table where Value
Between Lowest and Highest;in statement: used to specify the range of the conditionthe range
must be given wqithin the ()
         Ex:select * from employees where deperatment_id in (50, 60, 70, 80, 50)Order By statement:
         allows us to sort the columns in ascending or descending orderascedning
         order: ASCdescending order: DESCselect * from tableName order by ColumName DESC;
         select * from tableName order by ColumName ASC;select * from tableName order by ColumName;
         by defualut sorts in ascending orderLimiting results:
         is used for giving limit to the result
         in oracle SQL:  rownum keyword:
         select * from table where rownum <=5;
         in MySQL, PostgreSQL, SQLite:
         limit keyword:
          select * from employees limit 5;
          Count statement: returns the number of rows that are matching with the conditionwe
          use it with where statement alot
Aggregate functions:Min(Column): returns the min values from the  columnMax(Column):
returns the max values from the  columnAvg(Column): returns the Average values from the
columnSum(Column): returns the sum of all values from the columnRound Statement:
used as decimal formatterExcersices:1. List all the employees' first and last name with
 thier salary in employees table2. how many employees have salary less than 5000?3.
 how many employees have salary between 6000 and 7000?4.
 List all the different gerion ids in countries table5. display the salary of the employee
 Grant Douglas (lastName: Grant, firstname: Douglas)6. display the maximum salary in employees
  table7. display all informations of the employee who has the highest salary in employees table8.
   display the the second maximum salary from the employees table9. display all
    informations of the employee who has the second highest salary10.
    display the the minimum salary in employees table11.
     display all informations of the employee who has the minimum salary in employees table12.
      display the second minimum salary from the employees table13.
      display all informations of the employee who has the second minimum salary14.
      display the average salary of the employees;15. list all the employees who are making above the average salary;
      16. list all the employees who are making less than the average salary17.
      count the total numbers of the departments in departs table18.
      sort the start_date in ascending order in job_history's table19.
      sort the start_date in descending order in job_history's table20.
      list all the employees whose first name starts with 'A'21.
      list all the employees whose job_ID contains 'IT'22.
      list all the employees whose department id in 50, 80, 100

      1/17/2020JDBCTopics:JDBC ConnectJDBC StatementJDBC ExecuteQuery:
      ResultSetJDBC ExecuteUpdateMetaData:DataBaseMataDataResultSetMataDataJDBC:
      Java DataBase Connectivityin order to connect the Java to the DataBase,
      there are three informations that we MUST have
      1. Database username
      2. Database password
      3. JDBC URLin our databse: username = hrpassword = hrJDBC URL syntax:                 jdbc:DataBase-vendor:thin:@Host:PortNumber:SID                 URL: jdbc:oracle:thin:@YourHostAddress:1521:exThree Important steps in JDBC:1. Create connection: helps us to connect java project to the DataBasewe use Connection Interface to create conncetionwe call the getConnections() method from DriverManager classConnection  connect = Driver.getConnection(URL, username, password);2. Create Statement: allows us to execute SQL querieswe use Statement Interface to executer queriesstatement must be created from the connections
Statement statement = connect.createStatement();
3. ResultSet: helps us store the Data that came from database tables
after we execute querywe use ResultSet Interface to store the datain
order to execute query:ResultSet resultset=statement.executeQuery
("SQL Query for Retriving data");

     */
}
