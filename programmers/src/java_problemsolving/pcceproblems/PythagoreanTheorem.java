package java_problemsolving.pcceproblems;

import java.util.Scanner;

/**
 * Level : 0
 * Title : [PCCE 기출문제] 5번 / 피타고라스의 정리
 * 문제 유형 : PCCE 기출문제
 *
 * Started : 2024-09-27
 * Solved : 2024-09-27
 *
 *
 */
public class PythagoreanTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int)Math.pow(c, 2) - (int)Math.pow(a, 2);
        // int b_square = (c - a) * (c + a);

        System.out.println(b_square);
    }
}
