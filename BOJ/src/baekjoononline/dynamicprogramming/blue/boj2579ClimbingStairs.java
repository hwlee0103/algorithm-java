package baekjoononline.dynamicprogramming.blue;

import java.util.Arrays;
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

        public Pair(int scoreSum, int stepCount) {
            this.scoreSum = scoreSum;
            this.stepCount = stepCount;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }

        Pair[] pairs = new Pair[n];
        Arrays.fill(pairs, new Pair(0,0));
        pairs[0] = new Pair(arr[0],1);
        for(int i = 0; i < n; ++i) {
            for(int j = i - 1; j >= i - 2 ; j--) {
                int step = 1;
                int nowSum = 0;
                if(j >= 0) {
                    if(j == i - 1) {
                        if(pairs[j].stepCount == 2) {
                            continue;
                        } else {
                            step++;
                        }
                    } else { // j == i - 2
                        step = 1;
                    }
                    nowSum = pairs[j].scoreSum + arr[i];
                } else { // j < 0
                    // TODO: 초기세팅 말고, 여기서 로직 넣어줄 수 있는 지 보기
                    continue;
                }
                if(nowSum > pairs[i].scoreSum) {
                    pairs[i].scoreSum = nowSum;
                    pairs[i].stepCount = step;
                }
            }
        }

        System.out.println(pairs[n - 1].scoreSum);
    }
}
