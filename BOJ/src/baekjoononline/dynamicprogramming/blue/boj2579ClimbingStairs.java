package baekjoononline.dynamicprogramming.blue;

import java.util.Scanner;

/**
 * Level : Blue 3
 * Title : 2579 계단 오르기
 * 문제 유형 : 동적 계획법 Dynamic Programming
 *
 * Started : 2025-02-21
 * Solved : 2025-02-
 *
 *
 *
 *
 */

public class boj2579ClimbingStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[300];
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }

        int[] dp = new int[300];

        dp[0] = arr[0];
        dp[1] = dp[0] + arr[1];
        dp[2] = Math.max(arr[0], arr[1]) + arr[2];

        for(int i = 3; i < n; ++i) {
            // '연속된 3 계단은 밟지 않는다'
            dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i];
        }

        System.out.println(dp[n - 1]);
    }
}


/**
 * 반례 모음
 ------------------------------
 example 1
 6
 1
 2
 3
 100
 1
 100
 answer 1
 204
 example 2
 9
 2
 3
 1
 2
 3
 3
 1
 2
 3
 answer 2
 15
 ------------------------------
 example 3
 5
 5
 4
 3
 2
 1
 answer 3
 12
 ------------------------------
 example 4
 5
 1
 1000
 1000
 1
 1
 answer 4
 2001
 ------------------------------
 example 5
 6
 50
 100
 10
 10
 100
 1
 answer 5
 211
 ------------------------------
 *
 *
 *
 * */
