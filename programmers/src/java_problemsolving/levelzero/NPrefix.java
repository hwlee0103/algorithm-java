package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열의 앞의 n글자
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-11
 * Solved : 2024-07-11
 *
 *
 */
public class NPrefix {
    public static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        int n = input.nextInt();
        System.out.println(solution(my_string, n));
    }
}
