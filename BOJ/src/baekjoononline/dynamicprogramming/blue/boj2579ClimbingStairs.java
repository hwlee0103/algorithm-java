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
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }

        int[] dp = new int[n];
        int[] stepCnt = new int[n];

        dp[0] = arr[0];
        stepCnt[0] = 1;

        for(int i = 0; i < n; ++i) {
            for(int j = i - 1; j >= i - 2 ; j--) {
                int step = 1;
                int nowSum = 0;
                if(j >= 0) {
                    if(j == i - 1) {
                        if(stepCnt[j] == 2) {
                            continue;
                        } else {
                            step++;
                        }
                    } else { // j == i - 2
                        step = 1;
                    }
                    nowSum = dp[j] + arr[i];
                } else { // j < 0
                    step = 1;
                    nowSum = arr[i];
                }
                if(nowSum > dp[i]) {
                    dp[i] = nowSum;
                    stepCnt[i] = step;
                }
            }
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
 example 4 ---> 확인 필요
 5
 1
 1000
 1000
 1
 1
 answer 4
 2001
 ------------------------------
 example 5 ---> 확인 필요
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
