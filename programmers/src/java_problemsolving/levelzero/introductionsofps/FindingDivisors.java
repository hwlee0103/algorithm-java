package java_problemsolving.levelzero.introductionsofps;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 약수 구하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-17
 * Solved : 2024-05-17
 *
 * 문제
 * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 10,000
 *
 * 입출력 예
 * n	result
 * 24	[1, 2, 3, 4, 6, 8, 12, 24]
 * 29	[1, 29]
 *
 */
public class FindingDivisors {
    public static int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> now = new ArrayList<>();
        for(int i = 1; i <= n; ++i) {
            if(n%i == 0) {
                now.add(i);
            }
        }
        answer = new int[now.size()];
        for(int i = 0; i < now.size(); ++i)
            answer[i] = now.get(i);

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
