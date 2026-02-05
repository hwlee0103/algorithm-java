/**
 * Level : 1
 * Title : 나이 정보가 없는 회원 수 구하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-05
 * Solved : 2025-12-05
 *
 *
 */
SELECT
    COUNT(*) AS USERS
FROM USER_INFO
WHERE
    AGE is NULL