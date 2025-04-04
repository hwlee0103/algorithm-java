package baekjoononline.dynamicprogramming.blue;

import java.util.Scanner;

/**
 * Level : Blue 3
 * Title : 2xn 타일링
 * 문제 유형 : 동적계획법 Dynamic Programming
 *
 * Started : 2025-04-02
 * Solved : 2025-04-03
 *
 *
 */

public class boj11726TwoByNTiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] dp = new long[n+10];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }

        System.out.println(dp[n]);
    }
}
