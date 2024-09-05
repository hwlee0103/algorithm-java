package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열로 변환
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-09-05
 * Solved : 2024-09-05
 *
 * 문제
 * 정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 10000
 *
 * 입출력 예
 * n	result
 * 123	"123"
 * 2573	"2573"
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 123을 문자열로 변환한 "123"을 return합니다.
 * 입출력 예 #2
 * 2573을 문자열로 변환한 "2573"을 return합니다.
 *
 */
public class ConvertToString {
    public static String solution(int n) {
        return String.valueOf(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextInt()));
    }
}
