/**
 * Level : 2
 * Title : 조건에 맞는 아이템들의 가격의 총합 구하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-12
 * Solved : 2025-12-12
 *
 *
 */
SELECT
    SUM(PRICE) AS TOTAL_PRICE
FROM ITEM_INFO
WHERE RARITY = "LEGEND"