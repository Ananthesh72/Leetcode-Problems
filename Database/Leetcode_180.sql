/* Leetcode 180: Consecutive Numbers */
SELECT DISTINCT num AS ConsecutiveNums
FROM (
  SELECT
    num,
    LAG(num, 1) OVER (ORDER BY id) AS prev_num,
    LEAD(num, 1) OVER (ORDER BY id) AS next_n
  FROM Logs
) t
WHERE num = prev_num AND num = next_num;
