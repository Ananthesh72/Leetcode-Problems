/*184. Department Highest Salary
Write a solution to find employees who have the highest salary in each of the departments.
Return the result table in any order.*/

/*Solution 1 :-*/
SELECT D.name as Department,E.name AS Employee,E.Salary AS Salary
FROM Employee E 
JOIN Department D ON e.departmentId = E.departmentId
WHERE E.salary = (SELECT max(salary)
                FROM Employee E 
                where  departmentId = d.id);

/*Solution 2 :-*/
SELECT Department, Employee, Salary
FROM (
    SELECT D.name AS Department,
           E.name AS Employee,
           E.salary AS Salary,
           RANK() OVER (PARTITION BY D.id ORDER BY E.salary DESC) AS rnk
    FROM Employee E
    JOIN Department D ON E.departmentId = D.id
)
WHERE rnk = 1;
