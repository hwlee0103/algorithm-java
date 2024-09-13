package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 부족한 금액 계산하기
 * 문제 유형 : 위클리 챌린지
 *
 * Started : 2024-07-22
 * Solved : 2024-07-22
 *
 *
 */
public class CalculateInsufficientAmount {
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i = 1; i <= count; ++i) {
            sum += price * i;
        }

        answer = (sum - money) > 0 ? sum - money : 0;

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();
        int money = input.nextInt();
        int count = input.nextInt();
        System.out.println(solution(price, money, count));
    }
}
