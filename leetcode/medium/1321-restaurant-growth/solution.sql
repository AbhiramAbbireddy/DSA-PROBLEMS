-- Write your PostgreSQL query statement below
with daily_amount as (
    select visited_on , 
        sum(amount) as amount
from customer
group by visited_on ),
moving_window as (
    select visited_on,
            sum(amount) over(
                order by visited_on
                rows between 6 preceding and current row
            ) as amount,
            count(*) over(
                order by visited_on
                rows between 6 preceding and current row
            ) as days
    from daily_amount
) 
select visited_on,
        amount,
        round(amount::numeric/7,2) as average_amount
from moving_window
where days=7
order by visited_on;