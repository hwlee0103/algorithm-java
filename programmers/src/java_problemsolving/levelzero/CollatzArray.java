package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 콜라츠 수열 만들기
 * 문제 유형 : 코딩 기초 트레이닝
 *
 * Started : 2024-06-30
 * Solved : 2024-06-30
 *
 * 문제
 * 모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고,
 * x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
 * 그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
 * 계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
 * 임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 1,000
 *
 * 입출력 예
 * n	result
 * 10	[10, 5, 16, 8, 4, 2, 1]
 *
 * 입출력 예 #1
 * 순서대로 연산한 결과를 표로 만들면 다음과 같습니다.
 * 연산 횟수	x	홀짝 여부
 * 0	10	짝수
 * 1	5	홀수
 * 2	16	짝수
 * 3	8	짝수
 * 4	4	짝수
 * 5	2	짝수
 * 6	1	홀수
 * 따라서 [10, 5, 16, 8, 4, 2, 1]을 return 합니다.
 *
 */
public class CollatzArray {
    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> collatz = new ArrayList<>();
        while(n != 1) {
            collatz.add(n);
            if(n%2 == 0) n /= 2;
            else {
                n = 3*n + 1;
            }
        }
        collatz.add(1);

        answer = new int[collatz.size()];
        for(int i = 0; i< collatz.size(); ++i) {
            answer[i] = collatz.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] answer = solution(n);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
