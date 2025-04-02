package baekjoononline.dynamicprogramming.brown;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Brown 1
 * Title : 알고리즘 수업 - 피보나치 수 1
 * 문제 유형 : 동적계획법 Dynamic Programming
 *
 * Started : 2025-04-01
 * Solved : 2025-04-02
 *
 *
 */

public class boj24416AlgorithmFibonacciNumber1 {
    public static int reqCnt = 0;
    public static int dpCnt = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] answer = new int[2];
        // 값이 아니라 실행 횟수 출력
        answer[0] = recursiveFibo(n);
        answer[1] = dpFibo(n);

//        System.out.println(Arrays.toString(answer).replaceAll("\\[", "").replaceAll("]", ""));
        System.out.println(reqCnt + " " + dpCnt);
    }

    public static int recursiveFibo(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2){
            reqCnt++;
            return 1;
        }
        return recursiveFibo(n - 1) + recursiveFibo(n - 2);
    }

    public static int dpFibo(int n) {
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;
        for(int i = 3; i <= n; i++) {
            dpCnt++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
