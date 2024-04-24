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
 * 문제
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 10 ≤ price ≤ 1,000,000
 * price는 10원 단위로(1의 자리가 0) 주어집니다.
 * 소수점 이하를 버린 정수를 return합니다.
 *
 * 입출력 예
 * price	result
 * 150,000	142,500
 * 580,000	464,000
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
