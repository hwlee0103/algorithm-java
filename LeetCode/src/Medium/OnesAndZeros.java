package Medium;

import java.util.Arrays;

/**
 * Level : Medium
 * Title : 474. Ones and Zeros
 * Topic : Array, String, Dynamic Programming
 *
 * Started : 2025-11-11
 * Solved : 2025-11-11
 * Time: 30 min 27 sec --
 * Algorithm: 2차원 0/1 Knapsack 문제; Top-down으로 추정
 * RE
 *
 *
 */

public class OnesAndZeros {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for(String s : strs) {
            int z = 0, o = 0;
            for(char c: s.toCharArray()) {
                if(c == '0') z++;
                else o++;
            }
            // 0/1 knapsack
            for(int i = m; i >= z; i--) {
                for(int j = n; j >= o; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-z][j-o] + 1);
                }
            }
        }

        return dp[m][n];
    }
}
