/**
 * Level : 1
 * Title : 12세 이하인 여자 환자 목록 출력
 * 문제 유형 : MYSQL
 *
 * Started : 2026-02-12
 * Solved : 2026-02-12
 *
 *
 */
SELECT
    PT_NAME
     , PT_NO
     , GEND_CD
     , AGE
     , IFNULL(TLNO, 'NONE')
FROM PATIENT
WHERE
    AGE <= 12
  AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC