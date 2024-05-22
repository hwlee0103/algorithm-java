package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 자릿수 더하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-22
 * Solved : 2024-05-22
 *
 * 문제
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 *
 * 제한사항
 * 0 ≤ n ≤ 1,000,000
 *
 * 입출력 예
 * n	    result
 * 1234	    10
 * 930211	16
 *
 */
public class AddDigits {
    public static int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
