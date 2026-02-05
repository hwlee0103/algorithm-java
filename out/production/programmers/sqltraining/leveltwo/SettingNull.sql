/**
 * Level : 2
 * Title : NULL 처리하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-17
 * Solved : 2025-12-17
 *
 *
 */
SELECT
    ANIMAL_TYPE
     , IFNULL(NAME, "No name") AS NAME
     , SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID