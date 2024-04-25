package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 특정 문자 제거하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-25
 * Solved : 2024-04-25
 *
 * 문제
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 100
 * letter은 길이가 1인 영문자입니다.
 * my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
 * 대문자와 소문자를 구분합니다.
 *
 * my_string	letter	result
 * "abcdef"	    "f"	    "abcde"
 * "BCBdbe"	    "B"	    "Cdbe"
 *
 */
public class RemoveSpecificChar {
    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.next();
        String letter = input.next();
        System.out.println(solution(my_string, letter));
    }

}
