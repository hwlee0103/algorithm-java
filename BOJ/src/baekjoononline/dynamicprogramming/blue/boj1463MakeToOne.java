package baekjoononline.dynamicprogramming.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 3
 * Title : 1463 1로 만들기
 * 문제 유형 : 동적 계획법 Dynamic Programming
 *
 * Started : 2025-03-20
 * Solved : 2025-03-20
 *
 *
 *
 *
 */

public class boj1463MakeToOne {
    public static int MAX = 10000000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] dp = new int[10000000];
        Arrays.fill(dp, MAX);
        System.out.println(dynamic(n, dp));
    }

    public static int dynamic(int n, int[] dp) {
        if(n < 0) return MAX;
        if(n == 0 || n == 1) return dp[n] = 0;
        if(dp[n] != MAX) return dp[n];
        if(n%3 == 0) {
            dp[n] = Math.min(dp[n], dynamic(n/3, dp) + 1);
        }
        if(n%2 == 0) {
            dp[n] = Math.min(dp[n], dynamic(n/2, dp) + 1);
        }
        return dp[n] = Math.min(dp[n], dynamic(n-1, dp) + 1);
    }
}
