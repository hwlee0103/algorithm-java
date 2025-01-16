/**
 * Level : 1
 * Title : 평균 일일 대여 요금 구하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-01-16
 * Solved : 2025-01-16
 *
 *
 */

SELECT
    ROUND(AVG(DAILY_FEE), 0) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'