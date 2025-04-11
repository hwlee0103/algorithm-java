package baekjoononline.dynamicprogramming.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 5
 * Title : 1010 다리놓기
 * 문제 유형 : 동적 계획법 Dynamic Programming
 *
 * Started : 2025-04-11
 * Solved : 2025-
 *
 *
 *
 *
 */

public class boj1010BuildingBridges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[][] queries = new int[t][2];
        for(int i=0; i<t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            queries[i][0] = n;
            queries[i][1] = m;
        }

        long[][] dp = new long[35][35];
        for(int i = 1; i < dp.length; ++i) {
            for(int j = i; j < dp[0].length; ++j) {
                if(i == 1) dp[i][j] = j;
                else dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
            }
        }

        for(int i=0; i<t; i++) {
            System.out.println(dp[queries[i][0]][queries[i][1]]);
        }
    }
}
