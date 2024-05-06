package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 모음 제거
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-06
 * Solved : 2024-05-06
 *
 * 문제
 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
 * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 *
 * 제한사항
 * my_string은 소문자와 공백으로 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 *
 * 입출력 예
 * my_string	        result
 * "bus"	            "bs"
 * "nice to meet you"	"nc t mt y"
 *
 */
public class RemoveVowels {
    public static String solution(String my_string) {
        // my_string = my_string.replaceAll("a", "");
        // my_string = my_string.replaceAll("e", "");
        // my_string = my_string.replaceAll("i", "");
        // my_string = my_string.replaceAll("o", "");
        // my_string = my_string.replaceAll("u", "");
        my_string = my_string.replaceAll("[aeiou]", "");
        return my_string;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
