package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 순서쌍의 개수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-30
 * Solved : 2024-04-30
 *
 * 문제
 * 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
 * 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 1,000,000
 *
 * 제한사항
 * n	result
 * 20	6
 * 100	9
 *
 */
public class NumOfOrderedPair {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; ++i) {
            if(n%i==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
