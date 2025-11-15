package Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Level : Medium
 * Title : 2654. Minimum Number of Operations to Make All Array Elements Equal to 1
 * Topic : Array, Math, Number Theory, Weekly Contest 342
 *
 * Started : 2025-11-12
 * Solved : 2025-11-
 * Time: 27 min 05 sec -ing
 * Algorithm:
 *
 *
 *
 */

public class MakeAlltoOne {
    // 1. GCD method
    // 2. minimum number of operation
    //      a. choose start index -> how?
    //          i. same x = no operations
    //          ii. 서로소인 원소 먼저 연산 -> gcd가 1인 연산 먼저 -> 왜냐, 거기부터 시작임. 양쪽으로 전부 연산
    //          iii. 서로소인 원소가 없을 경우? -> 맨 앞부터? -> 이게 최소인지는 어떻게 알아?
    //      b. gcd
    //      c. change values
    //      d. count each
    // 3. Algorithm? DP, parametric search?
    //      a. 시뮬레이션 -> no
    //      b. DP
    //          i. 점화식이 구성되는가?
    //              - dp[계산횟수][idx]
    //              - dp[1][0] = idx = 0을 기준으로 1번 연산했을 때의 결과?
    //              - dp[2][0] = 1이면 그냥 1 저장?
    //              - 전부 1이 되어야 하므로 전체 탐색이 필요해..
    //              - [6,10,15]
    //              - dp  0             1          2
    //              - 1   [2, 2, 15]   [2, 5, 5]   0
    //              - 2   -> pass
    //          ii. DP 아닌듯?
    //      c. parametric search
    //          i. 최대 횟수는 .. 가장 큰 maxNum으로 해도 되겠지 뭐
    //          ii. 이분탐색으로 찾아나가서 mid 횟수 내에 가능한 지 확인 필요 -> 어떻게?
    //
    public static void main(String[] args) {

    }

    public static int minOperations(int[] nums) {
        int n = nums.length;

        int g = 0;
        int cnt = 0; // one count
        for(int i = 0; i < nums.length; i++){
            g = gcd(nums[i], g);
            if(nums[1] == 1) cnt++;
        }
        if(g != 1) return -1;
        if(cnt >= 1) return nums.length - cnt;

        int Lmin = Integer.MAX_VALUE;
        // "i에서 끝나는 모든 구간의 gcd"들을 집합으로 유지(각 gcd에 대해 최소 길이만 보존)
        Map<Integer, Integer> prev = new HashMap<>();

        for(int x: nums) {
            Map<Integer, Integer> current = new HashMap<>();
            current.put(x, 1); // first range: length 1

            // add x to i - 1 ending ranges
            for(Map.Entry<Integer, Integer> e: prev.entrySet()) {
                int nextGcd = gcd(e.getKey(), x);
                int length = e.getValue() + 1;
                Integer old = current.get(nextGcd); // update length
                if(old == null || length < old) current.put(nextGcd, length);
            }

            Integer len1 = current.get(1);
            if(len1 != null) Lmin = Math.min(Lmin, len1);
            prev = current;
        }
        return n + Lmin - 2;
    }

    private static int gcd(int a, int b) {
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

}
