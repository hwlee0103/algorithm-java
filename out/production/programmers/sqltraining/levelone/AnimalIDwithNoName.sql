/**
 * Level : 1
 * Title : 이름이 없는 동물의 아이디
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-10
 * Solved : 2025-12-10
 *
 *
 */
SELECT
    ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME is NULL
ORDER BY ANIMAL_ID