package java_problemsolving.levelzero.introductionsofps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 정렬하기 (2)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-26
 * Solved : 2024-05-26
 *
 * 문제
 * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
 * my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 < my_string 길이 < 100
 *
 * 입출력 예
 * my_string	result
 * "Bcad"	    "abcd"
 * "heLLo"	    "ehllo"
 * "Python"	    "hnopty"
 *
 */
public class SortString2 {
    public static String solution(String my_string) {
        char[] str = my_string.toLowerCase().toCharArray();
        Arrays.sort(str);
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
