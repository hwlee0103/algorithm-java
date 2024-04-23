package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 피자 나눠 먹기 (3)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-23
 * Solved : 2024-04-23
 *
 * 문제
 * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
 * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
 * n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 2 ≤ slice ≤ 10
 * 1 ≤ n ≤ 100
 *
 * 입출력 예
 * slice	n	result
 * 7	    10	2
 * 4	    12	3
 *
 */
public class SharePizza3 {
    public static int solution(int slice, int n) {
        int answer = n/slice;
        if(n%slice > 0) answer++;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int slice = input.nextInt();
        int n = input.nextInt();
        System.out.println(solution(slice, n));
    }
}
