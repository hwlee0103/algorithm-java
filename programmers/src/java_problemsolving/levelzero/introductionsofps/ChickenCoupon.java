package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 치킨 쿠폰
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-18
 * Solved : 2024-06-18
 *
 *
 */
public class ChickenCoupon {
    public static int solution(int chicken) {
        int answer = 0;
        while(chicken > 9) {
            answer += chicken/10;
            chicken = chicken%10 + chicken/10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chicken = input.nextInt();
        System.out.println(solution(chicken));
    }
}
