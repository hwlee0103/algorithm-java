package JavaProblemSolving.Medium;

import java.util.*;

/**
 * Level : Medium
 * Title : 347. Top K Frequent Elements
 * Topic : Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect
 *
 * Started : 2025-11-05
 * Solved : 2025-11-05
 * Time: 08 min 38 sec
 * Algorithm: Map, HashMap 정렬 사용 -> PriorityQueue
 *
 *
 */

public class TopKFrequentElements {
    // todo - main

    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int x: nums) freq.merge(x, 1, Integer::sum);

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        pq.addAll(freq.entrySet());

        int[] ans = new int[k];
        for(int i = 0; i < k; ++i) {
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }

    public int[] topKFrequent(int[] nums, int k) {
        // Map<숫자, 횟수> 넣고 횟수 별로 내림차순정렬
        // EntrySet으로 가져와서 k 개만큼 ans에 삽입 후 return
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i) {
            map.merge(nums[i], 1, Integer::sum);
        }
        int[] ans = sortMapTopK(map, k);

        return ans;
    }

    private int[] sortMapTopK(Map<Integer, Integer> map, int k) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> {
            int c = Integer.compare(e2.getValue(), e1.getValue());
            if(c != 0) return c;
            return Integer.compare(e1.getKey(), e2.getKey());
        });

        int[] ans = new int[k];
        for(int i = 0; i < k; ++i) {
            Map.Entry<Integer, Integer> now = list.get(i);
            ans[i] = now.getKey();
        }
        return ans;
    }
}
