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
