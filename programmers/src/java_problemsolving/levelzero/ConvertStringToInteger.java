package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열을 정수로 변환하기
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-09-02
 * Solved : 2024-09-02
 *
 *
 */
public class ConvertStringToInteger {
    public static int solution(String n_str) {
        return Integer.parseInt(n_str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
