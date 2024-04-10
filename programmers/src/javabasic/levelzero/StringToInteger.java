package javabasic.levelzero;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 문자열을 정수로 바꾸기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-04-10
 * Solved : 2024-04-10
 *
 *
 */
public class StringToInteger {
    public static int solution(String s) {
        int answer = Integer.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(solution(str));
    }

}
