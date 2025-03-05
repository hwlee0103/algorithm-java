package baekjoononline.dynamicprogramming.blue;

import java.util.Scanner;

/**
 * Level : Blue 3
 * Title : 9095 1, 2, 3 더하기
 * 문제 유형 : 동적 계획법 Dynamic Programming
 *
 * Started : 2025-03-05
 * Solved : 2025-03-05
 *
 *
 *
 *
 */

public class boj9095AddingOneTwoThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] queries = new int[n];
        for(int i = 0; i < n; ++i) {
            queries[i] = input.nextInt();
        }

        int[] dp = new int[11];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i < 11; ++i) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        for(int i = 0; i < queries.length; ++i) {
            System.out.println(dp[queries[i]]);
        }
    }
}
