package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-13
 * Solved : 2024-08-13
 *
 *
 */
public class LongestSubStringWithSpecificString {
    public static String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
