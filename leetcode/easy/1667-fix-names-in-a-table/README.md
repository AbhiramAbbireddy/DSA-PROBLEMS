# Fix Names in a Table

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Users`

```
+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| user_id        | int     |
| name           | varchar |
+----------------+---------+
user_id is the primary key (column with unique values) for this table.
This table contains the ID and the name of the user. The name consists of only lowercase and uppercase characters.

```

 

Write a solution to fix the names so that only the first character is uppercase and the rest are lowercase.

Return the result table ordered by `user_id`.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Users table:
+---------+-------+
| user_id | name  |
+---------+-------+
| 1       | aLice |
| 2       | bOB   |
+---------+-------+
Output: 
+---------+-------+
| user_id | name  |
+---------+-------+
| 1       | Alice |
| 2       | Bob   |
+---------+-------+

```

## Solution

**Language:** SQL  
**Runtime:** 385 ms (beats 93.00%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-09-06T01:45:58.111Z  

```sql
-- Write your PostgreSQL query statement below
select 
    user_id,
    upper(substr(name,1,1)) || lower(substr(name,2)) as name
from Users
order by user_id;
```

---

[View on LeetCode](https://leetcode.com/problems/fix-names-in-a-table/)