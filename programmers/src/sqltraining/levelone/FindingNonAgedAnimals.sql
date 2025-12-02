/**
 * Level : 1
 * Title : 어린 동물 찾기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-02
 * Solved : 2025-12-02
 *
 *
 */

SELECT
    ANIMAL_ID
     , NAME
FROM ANIMAL_INS
WHERE
    INTAKE_CONDITION <> 'Aged'
ORDER BY ANIMAL_ID