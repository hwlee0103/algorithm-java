/**
 * Level : 1
 * Title : 인기있는 아이스크림
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-24
 * Solved : 2025-12-24
 *
 *
 */
SELECT
    FLAVOR
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC