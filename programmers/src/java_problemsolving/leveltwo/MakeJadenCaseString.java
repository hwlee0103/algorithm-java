package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : JadenCase 문자열 만들기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-07-16
 * Solved : 2024-07-16
 *
 *
 */
public class MakeJadenCaseString {
    public static String solution(String s) {
        String answer = "";
        boolean isFirst = true;
        for(int i = 0; i < s.length(); ++i) {
            if(isFirst) {
                answer += Character.toUpperCase(s.charAt(i));
                isFirst = false;
            } else {
                answer += Character.toLowerCase(s.charAt(i));
            }
            if(s.charAt(i) == ' ') {
                isFirst = true;
                continue;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(solution(s));
    }
}
