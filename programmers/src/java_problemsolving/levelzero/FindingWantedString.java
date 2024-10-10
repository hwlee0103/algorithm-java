package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 원하는 문자열 찾기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-06
 * Solved : 2024-08-06
 *
 *
 */
public class FindingWantedString {
    public static int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        return (myString.contains(pat) == true) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        String pat = input.nextLine();
        System.out.println(solution(myString, pat));
    }
}
