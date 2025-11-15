/**
 * Level : Easy
 * Title : 196. Delete Duplicate Emails
 * Topic : Database
 *
 * Started : 2025-11-15
 * Solved : 2025-11-15
 * Time: -
 * Algorithm: JOIN table & Math Function
 *
 *
 *
 */

DELETE Person FROM Person
JOIN (
    SELECT MIN(id) AS min_id, email
    FROM Person
    GROUP BY email
) AS T
ON Person.email = T.email
AND Person.id > T.min_id;