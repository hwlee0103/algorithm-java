package javabasic.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : n의 배수
 * 문제 유형 : 연산
 *
 * Started : 2024-04-01
 * Solved : 2024-04-01
 *
 *
 */
public class MultipleOfN {
    public static int solution(int num, int n) {
        return (num%n == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n = input.nextInt();

        System.out.println(solution(num, n));
    }
}
