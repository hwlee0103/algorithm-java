/**
 * Level : 2
 * Title : 카테고리 별 상품 개수 구하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-22
 * Solved : 2025-12-22
 *
 *
 */
SELECT
    LEFT(PRODUCT_CODE, 2) AS CATEGORY_CODE,
    COUNT(*) AS PRODUCT_COUNT
FROM PRODUCT
GROUP BY LEFT(PRODUCT_CODE, 2)
ORDER BY CATEGORY_CODE