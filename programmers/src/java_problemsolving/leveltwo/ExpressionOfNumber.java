package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 숫자의 표현
 * 문제 유형 : 연습문제
 *
 * Started : 2024-08-03
 * Solved : 2024-08-03
 *
 *
 */
public class ExpressionOfNumber {
    public static int solution(int n) {
        int answer = 0;
        for(int k = 1; k <= n; ++k) {
            int sum = 0;
            for(int i = k; sum <= n; ++i) {
                if(sum == n) {
                    answer++;
                    break;
                } else {
                    sum += i;
                }
            }
        }
        // 다른 풀이
        // 정수론 정리
        // 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다
//        for(int i = 1; i <= n; i +=2) {
//            if(n % i == 0) {
//                answer++;
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
