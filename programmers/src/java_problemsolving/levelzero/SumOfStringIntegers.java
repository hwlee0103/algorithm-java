package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 정수의 합
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-09-02
 * Solved : 2024-09-02
 *
 *
 */
public class SumOfStringIntegers {
    public static int solution(String num_str) {
        int answer = 0;
        for(int i = 0; i < num_str.length(); ++i) {
            answer += (num_str.charAt(i) - '0');
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
