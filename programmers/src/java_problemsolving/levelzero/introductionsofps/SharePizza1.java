package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 피자 나눠 먹기 (1)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-23
 * Solved : 2024-04-23
 *
 * 문제
 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 100
 *
 * 입출력 예
 * n	result
 * 7	1
 * 1	1
 * 15	3
 *
 */
public class SharePizza1 {
    public static int solution(int n) {
        int answer = n/7;
        if(n%7 > 0) answer++;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
