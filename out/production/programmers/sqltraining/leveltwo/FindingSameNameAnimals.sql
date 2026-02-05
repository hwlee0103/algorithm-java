/**
 * Level : 2
 * Title : 동명 동물 수 찾기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-16
 * Solved : 2025-12-16
 *
 *
 */
SELECT
    NAME
     , COUNT(*) AS COUNT
FROM ANIMAL_INS
WHERE
    NAME <> ''
GROUP BY NAME
HAVING COUNT(*) >= 2
ORDER BY NAME