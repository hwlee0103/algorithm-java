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
 * 문제
 * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
 *
 * 입출력 예
 * my_string	result
 * "cccCCC"	    "CCCccc"
 * "abCdEfghIJ"	"ABcDeFGHij"
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
