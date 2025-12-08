/**
 * Level : 1
 * Title : 여러 기준으로 정렬하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-08
 * Solved : 2025-12-08
 *
 *
 */
SELECT
    ANIMAL_ID
     , NAME
     , DATETIME
FROM ANIMAL_INS
ORDER BY NAME ASC, DATETIME DESC