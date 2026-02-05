/**
 * Level : 1
 * Title : 흉부외과 또는 일반외과 의사 목록 출력하기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-23
 * Solved : 2025-12-23
 *
 *
 */
SELECT
    DR_NAME
     , DR_ID
     , MCDP_CD
     , DATE_FORMAT(HIRE_YMD, '%Y-%m-%d')
FROM DOCTOR
WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME ASC