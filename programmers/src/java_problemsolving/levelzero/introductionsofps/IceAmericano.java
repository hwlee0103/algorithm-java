package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 아이스 아메리카노
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-24
 * Solved : 2024-04-24
 *
 * 문제
 * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
 * 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 < money ≤ 1,000,000
 *
 * 입출력 예
 * money	result
 * 5,500	[1, 0]
 * 15,000	[2, 4000]
 *
 */
public class IceAmericano {
    public static int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();

        int[] answer = solution(money);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
