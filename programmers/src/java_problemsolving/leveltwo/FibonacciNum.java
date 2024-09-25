package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 피보나치 수
 * 문제 유형 : 연습문제
 *
 * Started : 2024-08-07
 * Solved : 2024-08-07
 *
 *
 */
public class FibonacciNum {
    public static long solution(int n) {
        long[] fibo = new long[100001];
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i <= n; ++i) {
            fibo[i] = (fibo[i-2]%1234567 + fibo[i-1]%1234567)%1234567;
        }

        return fibo[n];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
