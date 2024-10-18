package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 세균 증식
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-23
 * Solved : 2024-05-23
 *
 *
 */
public class BacterialGrowth {
    public static int solution(int n, int t) {
        return (int)Math.pow(2, t) * n ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        System.out.println(solution(n, t));
    }
}
