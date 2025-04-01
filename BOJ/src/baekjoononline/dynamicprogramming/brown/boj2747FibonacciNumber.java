package baekjoononline.dynamicprogramming.brown;

import java.util.Scanner;

/**
 * Level : Brown 2
 * Title : 피보나치 수
 * 문제 유형 : 동적계획법 Dynamic Programming
 *
 * Started : 2025-04-01
 * Solved : 2025-04-01
 *
 *
 */

public class boj2747FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<=n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.println(fibo[n]);
    }
}
