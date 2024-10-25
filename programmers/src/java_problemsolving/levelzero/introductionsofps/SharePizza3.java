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
