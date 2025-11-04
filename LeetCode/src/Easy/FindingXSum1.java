package Easy;

import java.util.*;

/**
 * Level : Easy
 * Title : 3318. Find X-Sum of All K-Long SubArrays 1
 * Topic : Array, Hash Table, Sliding Window, Heap (Priority Queue), Weekly Contest 419
 *
 * Started : 2025-11-04
 * Solved : 2025-11-04
 * Time: -
 * Algorithm: Sliding Window 사용
 *
 *
 */

public class FindingXSum1 {
    // todo - main
    
    static final class Node {
        final int value;
        final int freq;
        Node(int value, int freq) {this.value = value;this.freq = freq;}
    }

    // 비교자: freq↑, value↑  (L.first()가 L에서 가장 '약한' 상위 항목)
    private static final Comparator<Node> CMP = (a, b) -> {
        if(a.freq != b.freq) return Integer.compare(a.freq, b.freq);
        if(a.value != b.value) return Integer.compare(a.value, b.value);
        return 0;
    };

    public static int[] findXSum2(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Map<Integer, Integer> cnt = new HashMap<>();
        TreeSet<Node> topx = new TreeSet<>(CMP);
        TreeSet<Node> remain = new TreeSet<>(CMP);
        int sum = 0;

        // todo

        return ans;
    }

    public static int[] findXSum1(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Map<Integer, Integer> cnt = new HashMap<>();

        // 초기 윈도우
        for(int i = 0; i < k; ++i) cnt.merge(nums[i], 1, Integer::sum);
        ans[0] = topXSum(cnt, x);

        for(int i = k; i < n; ++i) {
            int out = nums[i - k], in = nums[i];

            // out
            int co = cnt.getOrDefault(out, 0) - 1;
            if(co <= 0) cnt.remove(out);
            else cnt.put(out, co);

            // in
            cnt.merge(in, 1, Integer::sum);

            ans[i - k + 1] = topXSum(cnt, x);
        }
        return ans;
    }

    // top X sum
    private static int topXSum(Map<Integer, Integer> map, int x) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> {
            int c = Integer.compare(e2.getValue(), e1.getValue()); // occur
            if(c != 0) return c;
            return Integer.compare(e2.getKey(), e1.getKey()); // value
        });
        int sum = 0;
        for(int i = 0; i < Math.min(x, list.size()); ++i) {
            Map.Entry<Integer, Integer> e = list.get(i);
            sum += e.getKey() * e.getValue();
        }
        return sum;
    }
}
