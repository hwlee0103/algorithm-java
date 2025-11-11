package Medium;

import java.util.Arrays;

/**
 * Level : Medium
 * Title : 474. Ones and Zeros
 * Topic : Array, String, Dynamic Programming
 *
 * Started : 2025-11-11
 * Solved : 2025-11-
 * Time: 30 min 27 sec
 * Algorithm: 2차원 Knapsack 문제; Top-down으로 추정
 *
 *
 *
 */

public class OnesAndZeros {
    public int findMaxForm(String[] strs, int m, int n) {
        // m = 5, n = 3
        // [10, 0001, 111001, 1, 0]
        // DP - 포함/ 불포함
        int[][] memo = new int[m][n];
        for(int i = 0; i < m; i++) Arrays.fill(memo[i], 0);
        int res = dp(memo, m, n);


        return res;
    }

    public int dp(int[][] memo, int m, int n) {

    }
}
