-- Write your PostgreSQL query statement below
with data_temp as(
    select *,
    dense_rank() over(partition by departmentId order by salary desc) as rank
    from employee
)
select d.name as Department,
        e.name as Employee,
        e.salary as Salary
from data_temp as e
join department as d
on e.departmentId=d.id
where e.rank<=3;