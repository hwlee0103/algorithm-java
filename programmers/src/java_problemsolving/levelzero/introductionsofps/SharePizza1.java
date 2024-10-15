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
