package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 정수 부분
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-08-31
 * Solved : 2024-08-31
 *
 *
 */
public class IntegerPart {
    public static int solution(double flo) {
        return (int) flo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextDouble()));
    }
}
