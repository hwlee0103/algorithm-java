/**
 * Level : 2
 * Title : 132202 진료과별 총 예약 횟수 출력하기
 * 문제 유형 : MYSQL - Group By
 *
 * Started : 2026-03-11
 * Solved : 2026-03-11
 *
 *
 */

SELECT
    MCDP_CD AS '진료과 코드'
    , COUNT(APNT_NO) AS '5월예약건수'
FROM
    APPOINTMENT
WHERE
    APNT_YMD BETWEEN '2022-05-01 00:00:00' AND '2022-06-01 00:00:00'
GROUP BY
    MCDP_CD
ORDER BY
    COUNT(APNT_NO), MCDP_CD