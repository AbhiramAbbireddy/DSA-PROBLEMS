# Second Highest Salary

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Table: `Employee`

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| salary      | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
Each row of this table contains information about the salary of an employee.

```

 

Write a solution to find the second highest  **distinct**  salary from the `Employee` table. If there is no second highest salary, return `null (return None in Pandas)`.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
Output: 
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+

```

 **Example 2:** 

```
Input: 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
+----+--------+
Output: 
+---------------------+
| SecondHighestSalary |
+---------------------+
| null                |
+---------------------+

```

## Solution

**Language:** SQL  
**Runtime:** 198 ms (beats 77.85%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-09-06T01:12:44.315Z  

```sql
-- Write your PostgreSQL query statement below
select max (salary) as SecondHighestSalary 
from (
    select *,
    dense_rank() over(order by salary desc) as rank
    from employee
) t
where rank=2;
```

---

[View on LeetCode](https://leetcode.com/problems/second-highest-salary/)