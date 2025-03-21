package baekjoononline.dynamicprogramming.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 4
 * Title : 2839 설탕 배달
 * 문제 유형 : 동적 계획법 Dynamic Programming
 *
 * Started : 2025-03-06
 * Solved : 2025-03-07
 *
 *
 *
 *
 */

public class boj2839SugarDelivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] dp = new int[5001];
        Arrays.fill(dp, -1);

        dp[3] = dp[5] = 1;

        for(int i = 6; i <= n; i++) {
            if(dp[i-3] == -1 && dp[i-5] == -1) {
                continue;
            } else if(dp[i-3] == -1 || dp[i-5] == -1) {
                dp[i] = Math.max(dp[i-3], dp[i-5]) + 1;
            }
            else {
                dp[i] = Math.min(dp[i-3], dp[i-5]) + 1;
            }
        }

        System.out.println(dp[n]);
    }
}
