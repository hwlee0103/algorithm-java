/**
 * Level : 2
 * Title : 이름에 el이 들어가는 동물 찾기
 * 문제 유형 : MYSQL
 *
 * Started : 2025-12-17
 * Solved : 2025-12-17
 *
 *
 */
SELECT
    ANIMAL_ID
     , NAME
FROM ANIMAL_INS
WHERE NAME like '%el%'
  AND ANIMAL_TYPE = "Dog"
ORDER BY NAME