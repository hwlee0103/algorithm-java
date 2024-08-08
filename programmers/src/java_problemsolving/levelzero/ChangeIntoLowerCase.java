package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 소문자로 바꾸기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-08
 * Solved : 2024-08-08
 *
 * 문제
 * 알파벳으로 이루어진 문자열 myString이 주어집니다.
 * 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ myString의 길이 ≤ 100,000
 * myString은 알파벳으로 이루어진 문자열입니다.
 *
 * 입출력 예
 * myString	    result
 * "aBcDeFg"	"abcdefg"
 * "aaa"	    "aaa"
 *
 *
 */
public class ChangeIntoLowerCase {
    public static String solution(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
