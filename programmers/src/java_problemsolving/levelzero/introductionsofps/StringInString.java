package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열안에 문자열
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-23
 * Solved : 2024-05-23
 *
 *
 */
public class StringInString {
    public static int solution(String str1, String str2) {
        return (str1.contains(str2)) ? 1 : 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        System.out.println(solution(str1, str2));
    }
}
