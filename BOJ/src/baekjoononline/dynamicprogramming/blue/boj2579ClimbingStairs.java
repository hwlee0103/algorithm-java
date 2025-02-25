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
 */

public class boj2579ClimbingStairs {
    public static class Pair {
        int scoreSum = 0;
        int stepCount = 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }

        Pair[] pairs = new Pair[n];
        for(int i = 0; i < n; ++i) {
            int sum = 0;
            for(int j = i; j >= i-2 ; j--) {
                if(j < 0) {
                    pairs[i].scoreSum = arr[i];
                    pairs[i].stepCount = 1;
                }
                else {
                    // TODO; 조건 확인
                    pairs[i].scoreSum = Math.max(pairs[i].scoreSum, pairs[j].scoreSum + arr[i]);

                }
            }
        }
    }

}
