package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 숨어있는 숫자의 덧셈(1)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-06
 * Solved : 2024-05-06
 *
 * 문제
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 *
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.
 *
 * 입출력 예
 * my_string	    result
 * "aAb1B2cC34oOp"	10
 * "1a2b3c4d123"	16
 *
 */
public class SumOfHiddenNums {
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z]|[A-Z]", "");
        for(Character c : my_string.toCharArray()) {
            answer += c - '0'; //or getNumericValue(c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
