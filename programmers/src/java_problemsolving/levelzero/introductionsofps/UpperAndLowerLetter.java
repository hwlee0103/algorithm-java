package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 대문자와 소문자
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-15
 * Solved : 2024-05-15
 *
 *
 */
public class UpperAndLowerLetter {
    public static String solution(String my_string) {
        String answer = "";
        for(Character c : my_string.toCharArray()) {
            answer += (Character.isUpperCase(c)) ? String.valueOf(Character.toLowerCase(c)) : String.valueOf(Character.toUpperCase(c));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
