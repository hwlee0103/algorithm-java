package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 대문자로 바꾸기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-07
 * Solved : 2024-08-07
 *
 *
 */
public class ChangeIntoUpperCase {
    public static String solution(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        System.out.println(solution(myString));
    }
}
