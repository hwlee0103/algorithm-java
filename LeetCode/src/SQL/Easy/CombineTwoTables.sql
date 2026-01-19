/**
 * Level : Easy
 * Title : 175. Combine Two Tabled
 * 문제 유형 : Database
 *
 * Started : 2026-01-19
 * Solved : 2026-01-19
 *
 *
 */
select
    p.firstName
     , p.lastName
     , a.city
     , a.state
from Person p
         left join Address a on p.personId = a.personId