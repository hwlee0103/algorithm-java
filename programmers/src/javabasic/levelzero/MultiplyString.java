package javabasic.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 곱하기
 * 문제 유형 : 연산
 *
 * Started : 2024-03-27
 * Solved : 2024-03-27
 *
 *
 */
public class MultiplyString {
    public static String solution(String my_string, int k) {
        String answer = "";
        // 모범답안
        answer = my_string.repeat(k);

        // 풀이
//        for(int i = 0; i < k; ++i) {
//            answer += my_string;
//        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = input.nextInt();

        System.out.println(solution(str, n));
    }
}
