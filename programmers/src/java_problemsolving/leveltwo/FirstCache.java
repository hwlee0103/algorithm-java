package java_problemsolving.leveltwo;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Level : 2
 * Title : [1차] 캐시
 * Topic : 2028 KAKAO BLIND RECRUITMENT
 *
 * Started : 2026-01-02
 * Solved : 2026-02-03
 * Time: -
 * Algorithm: LRU 알고리즘
 *
 * todo: LRU 알고리즘 - 공부 및 블로그 정리
 *
 * // todo - map 유형으로 유무 확인 - cache 역할
 *         // hash map & doubly linked list
 *         // cache에 없을 경우 miss -> 시간 5
 *         // 있을 경우 hit -> 시간 1
 *         //
 */
public class FirstCache {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0){
            return cities.length * 5;
        }
        Map<String, Boolean> cache = new LinkedHashMap<String, Boolean>(cacheSize, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Boolean> eldest) {
                // 용량 초과 시 가장 오래된 항목(LRU) 제거
                return size() > cacheSize;
            }
        };

        int time = 0;
        for(String city : cities){
            String key = city.toLowerCase(Locale.ROOT);

            if(cache.containsKey(key)){
                cache.get(key); // 최근 사용 처리(LRU 순서 갱신)
                time += 1;
            } else {
                cache.put(key, true);
                time += 5;
            }
        }
        return time;
    }
}
