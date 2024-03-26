package basictraining.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 섞기
 * 문제 유형 : 연산
 *
 * Started : 2024-03-26
 * Solved : 2024-03-26
 *
 *
 */
public class MixingString {
    public static String solution(String str1, String str2) {
        String answer = "";

        for(int i = 0; i < str1.length(); ++i) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        System.out.println(solution(str1, str2));

    }
}
