-- Write your PostgreSQL query statement below
select round(sum(tiv_2016)::numeric,2) as tiv_2016
from (
    select *,
    count(*) over(partition by tiv_2015) as c1,
    count(*) over(partition by lat,lon) as c2
    from insurance
) t
where c1>1 and c2=1;