/**
 * Level : 2
 * Title : 가격이 제일 비싼 식품의 정보 출력하기
 * 문제 유형 : MySQL
 *
 * Started : 2026-01-23
 * Solved : 2026-01-23
 *
 *
 */
SELECT
    PRODUCT_ID
     , PRODUCT_NAME
     , PRODUCT_CD
     , CATEGORY
     , PRICE
FROM
    FOOD_PRODUCT
ORDER BY PRICE DESC LIMIT 1