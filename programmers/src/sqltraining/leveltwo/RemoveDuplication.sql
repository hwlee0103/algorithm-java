/**
 * Level : 2
 * Title : 중복 제거하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-11
 * Solved : 2025-12-11
 *
 *
 */
SELECT
    COUNT(DISTINCT NAME) AS count
FROM ANIMAL_INS
WHERE
    NAME is not NULL