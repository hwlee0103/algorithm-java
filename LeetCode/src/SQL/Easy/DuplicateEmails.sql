/**
 * Level : Easy
 * Title : Duplicate Emails
 * 문제 유형 : Database
 *
 * Started : 2026-01-30
 * Solved : 2026-01-30
 *
 *
 */
SELECT
    EMAIL
FROM Person
GROUP BY EMAIL
HAVING count(*) > 1