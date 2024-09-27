package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 부분 문자열
 * 문제 유형 : 조건문 활용
 *
 * Started : 2024-09-07
 * Solved : 2024-09-07
 *
 *
 */
public class SubStrings {
    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
