package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열로 변환
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-09-05
 * Solved : 2024-09-05
 *
 *
 */
public class ConvertToString {
    public static String solution(int n) {
        return String.valueOf(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextInt()));
    }
}
