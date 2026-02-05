/**
 * Level : 1
 * Title : 이름이 있는 동물의 아이디
 * 문제 유형 : MYSQL
 *
 * Started : 2025-11-28
 * Solved : 2025-11-28
 *
 *
 */
-- SELECT * FROM ANIMAL_INS
SELECT
    ANIMAL_ID
FROM
    ANIMAL_INS
WHERE
    NAME <> 'NULL'
  AND NAME <> ''
  AND NAME <> ' '
ORDER BY ANIMAL_ID
