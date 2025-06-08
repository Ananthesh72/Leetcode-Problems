#Leetcode 182. Duplicate Emails
SELECT emial as Email
FROM Person
GROUP BY emial
Having COUNT (*) > 1;