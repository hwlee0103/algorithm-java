/**
 * Level : 1
 * Title : 경기도에 위치한 식품 창고 목록 출력하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-18
 * Solved : 2025-12-18
 *
 *
 */
SELECT
    WAREHOUSE_ID
     , WAREHOUSE_NAME
     , ADDRESS
     , IFNULL(FREEZER_YN, 'N') AS FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS like '경기도%'
ORDER BY WAREHOUSE_ID