package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열의 뒤의 n글자
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-10
 * Solved : 2024-07-10
 *
 *
 */
public class LastNLettersOfString {
    public static String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n, my_string.length());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        int n = input.nextInt();
        System.out.println(solution(my_string, n));
    }
}
