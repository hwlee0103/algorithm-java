package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 팩토리얼
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-06
 * Solved : 2024-05-06
 *
 * 문제
 * i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
 * 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
 * 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
 *
 * i! ≤ n
 *
 * 제한사항
 * 0 < n ≤ 3,628,800
 *
 * 입출력 예
 * n	    result
 * 3628800	10
 * 7	    3
 *
 */
public class Factorial {
    public static int solution(int n) {
        int answer = 0;
        int[] factorial = new int[n+1];
        factorial[0] = 1;
        for(int i = 1;i <= n; ++i) {
            factorial[i] = factorial[i-1]*i;
            if(factorial[i] <= n) {
                answer = i;
            }
            if(factorial[i] > n) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
