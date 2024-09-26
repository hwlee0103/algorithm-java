package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 특정 문자를 대문자로 바꾸기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-12
 * Solved : 2024-08-12
 *
 *
 */
public class ChangeSpecificLettersToUpperCase {
    public static String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
