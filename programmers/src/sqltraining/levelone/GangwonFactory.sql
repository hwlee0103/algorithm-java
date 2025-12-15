/**
 * Level : 1
 * Title : 강원도에 위치한 생산공장 목록 출력하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-15
 * Solved : 2025-12-15
 *
 *
 */
SELECT
    FACTORY_ID
     , FACTORY_NAME
     , ADDRESS
FROM FOOD_FACTORY
WHERE
    ADDRESS like '강원도%'
ORDER BY FACTORY_ID