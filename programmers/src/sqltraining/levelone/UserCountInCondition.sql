/**
 * Level : 1
 * Title : 조건에 맞는 회원 수 구하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-22
 * Solved : 2025-12-22
 *
 *
 */
SELECT
    COUNT(*) AS USERS
FROM USER_INFO
WHERE AGE >= 20 AND AGE <= 29
  AND JOINED like '2021%'