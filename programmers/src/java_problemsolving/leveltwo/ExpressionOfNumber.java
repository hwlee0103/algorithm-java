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
 * 문제
 * Finn은 요즘 수학공부에 빠져 있습니다.
 * 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다.
 * 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
 *
 * 1 + 2 + 3 + 4 + 5 = 15
 * 4 + 5 + 6 = 15
 * 7 + 8 = 15
 * 15 = 15
 * 자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
 *
 * 제한사항
 * n은 10,000 이하의 자연수 입니다.
 *
 * 입출력 예
 * n	result
 * 15	4
 *
 * 입출력 예 설명
 * 입출력 예#1
 * 문제의 예시와 같습니다.
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
