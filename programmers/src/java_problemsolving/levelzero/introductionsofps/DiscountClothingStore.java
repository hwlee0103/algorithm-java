package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 옷가게 할인 받기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-24
 * Solved : 2024-04-24
 *
 *
 */
public class DiscountClothingStore {
    public static int solution(int price) {
        double answer = 0;
        if(price >= 500000) {
            answer = price*0.8;
        } else if(price >= 300000) {
            answer = price*0.9;
        } else if(price >= 100000) {
            answer = price*0.95;
        } else {
            answer = price;
        }
        return (int) answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();
        System.out.println(solution(price));
    }
}
