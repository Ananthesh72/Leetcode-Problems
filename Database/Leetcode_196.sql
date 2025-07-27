/* Delete the Dupli Emails */

DELETE FROM persons
WHERE id NOT IN (
    SELECT MIN(id)
    from persons
    GROUP BY email
);
