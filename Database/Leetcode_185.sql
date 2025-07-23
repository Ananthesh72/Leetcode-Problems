/*185. Department Top Three Salaries*/

SELECT 
    D.name AS Department,
    E.name AS Employee,
    E.salary AS Salary
FROM (
    SELECT 
        E.name,
        E.salary,
        E.departmentId,
        DENSE_RANK() OVER (PARTITION BY E.departmentId ORDER BY E.salary DESC) AS rnk
    FROM Employee E
) E
JOIN Department D ON E.departmentId = D.id
WHERE E.rnk <= 3;