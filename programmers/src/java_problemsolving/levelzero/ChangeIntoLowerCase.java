package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 소문자로 바꾸기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-08
 * Solved : 2024-08-08
 *
 *
 */
public class ChangeIntoLowerCase {
    public static String solution(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
