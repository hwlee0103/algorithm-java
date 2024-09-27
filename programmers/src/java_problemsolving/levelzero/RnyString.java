package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : rny_string
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-21
 * Solved : 2024-08-21
 *
 *
 */
public class RnyString {
    public static String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
