package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 약수의 합
 * 문제 유형 : 연습문제
 *
 * Started : 2024-04-14
 * Solved : 2024-04-14
 *
 *
 */
public class SumOfDivisor {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; ++i) {
            answer += (n%i==0) ? i : 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(solution(n));
    }
}
