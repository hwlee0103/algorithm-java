/**
 * Level : 1
 * Title : 아픈 동물 찾기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-16
 * Solved : 2025-12-16
 *
 *
 */
SELECT
    ANIMAL_ID
     , NAME
FROM ANIMAL_INS
WHERE
    INTAKE_CONDITION = 'Sick'
ORDER BY ANIMAL_ID