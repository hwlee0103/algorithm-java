/**
 * Level : 2
 * Title : DATETIME에서 DATE로 형 변환
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-18
 * Solved : 2025-12-18
 *
 *
 */
SELECT
    ANIMAL_ID
     , NAME
     , DATE_FORMAT(DATETIME, "%Y-%m-%d") AS 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID