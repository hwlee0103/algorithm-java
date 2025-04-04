package baekjoononline.dynamicprogramming.brown;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Brown 1
 * Title : 부녀회장이 될테야
 * 문제 유형 : 동적계획법 Dynamic Programming
 *
 * Started : 2025-04-04
 * Solved : 2025-04-04
 *
 *
 */
public class boj2775AssociationPresident {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[][] dp = new int[20][20];
        for(int i = 0; i< dp[0].length; i++) {
            dp[0][i] = i;
        }
        int[][] queries = new int[t][t];
        for(int i = 0; i < t; ++i) {
            queries[i][0] = input.nextInt();
            queries[i][1] = input.nextInt();
        }

        for(int i = 0; i < queries.length; ++i) {
            System.out.println(getDpResult(queries[i][0], queries[i][1], dp));
        }
    }

    public static int getDpResult(int k, int n, int[][] dp) {
        if(k == 0) return dp[0][n];
        if(n == 0 || n == 1) return dp[k][n] = getDpResult(k-1, n, dp);
        if(dp[k][n] != 0) return dp[k][n];
        return dp[k][n] = getDpResult(k, n-1, dp) + getDpResult(k-1, n, dp);
    }
}
