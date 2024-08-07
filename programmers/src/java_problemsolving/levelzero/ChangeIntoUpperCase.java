package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 대문자로 바꾸기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-07
 * Solved : 2024-08-07
 *
 * 문제
 * 알파벳으로 이루어진 문자열 myString이 주어집니다.
 * 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ myString의 길이 ≤ 100,000
 * myString은 알파벳으로 이루어진 문자열입니다.
 *
 * 입출력 예
 * myString	    result
 * "aBcDeFg"	"ABCDEFG"
 * "AAA"	    "AAA"
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * "AbCdEfG"의 0~2번 인덱스의 문자열은 "AbC"이며, 이는 pat인 "aBc"와 같습니다.
 * 따라서 1을 return 합니다.
 *
 * 입출력 예 #2
 * myString의 길이가 pat보다 더 짧기 때문에 myString의 부분 문자열 중 pat와 같은 문자열이 있을 수 없습니다.
 * 따라서 0을 return 합니다.
 *
 */
public class ChangeIntoUpperCase {
    public static String solution(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        System.out.println(solution(myString));
    }
}
