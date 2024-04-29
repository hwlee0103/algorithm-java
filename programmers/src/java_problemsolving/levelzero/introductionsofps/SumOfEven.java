package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 짝수의 합
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-29
 * Solved : 2024-04-29
 *
 * 문제
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 0 < n ≤ 1000
 *
 * n	result
 * 10	30
 * 4	6
 *
 */
public class SumOfEven {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i+=2) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
