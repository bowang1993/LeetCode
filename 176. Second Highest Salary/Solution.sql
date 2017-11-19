# Write your MySQL query statement below
SELECT (
select distinct Salary from Employee order by Salary Desc limit 1 offset 1
    ) AS SecondHighestSalary ;
