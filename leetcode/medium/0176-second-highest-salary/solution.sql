-- Write your PostgreSQL query statement below
select max (salary) as SecondHighestSalary 
from (
    select *,
    dense_rank() over(order by salary desc) as rank
    from employee
) t
where rank=2;