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
