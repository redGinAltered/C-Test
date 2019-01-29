/*
Table 'numbers'
Column 'num'
*/

SELECT num+1 AS start, (next_num-(num+1)) AS skips FROM (

    SELECT num, LEAD(num) OVER(ORDER BY num) AS next_num FROM numbers

) AS resp
WHERE num+1 <> next_num;