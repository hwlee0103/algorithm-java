package Medium;

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

        int g = 0;
        int idx = 0;
        int cnt = 0; // one count
        for(int i = 0; i < nums.length; i++){
            g = gcd(nums[i], g);
            if(nums[1] == 1) cnt++;
        }
        if(g != 1) return -1;

        if(cnt >= 1) return nums.length - cnt;


    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
