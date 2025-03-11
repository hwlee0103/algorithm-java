package baekjoononline.dynamicprogramming.brown;

import java.util.Scanner;

/**
 * Level : Brown 1
 * Title : 2748 피보나치 수 2
 * 문제 유형 : 동적 계획법 Dynamic Programming
 *
 * Started : 2025-03-10
 * Solved : 2025-03-10
 *
 *
 *
 *
 */

public class boj2748FibonacciNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] fiboArr = new long[95];

        fiboArr[0] = 0;
        fiboArr[1] = 1;
        for(int i = 2; i <= n; i++) {
            fiboArr[i] = fiboArr[i-1] + fiboArr[i-2];
        }
        System.out.println(fiboArr[n]);
    }
}
