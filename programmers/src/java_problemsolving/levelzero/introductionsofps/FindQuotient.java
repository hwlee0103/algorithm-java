package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 몫 구하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-21
 * Solved : 2024-04-21
 *
 * 문제
 * 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 < num1 ≤ 100
 * 0 < num2 ≤ 100
 *
 * 입출력 예
 * num1	num2	result
 * 10	5	    2
 * 7	2	    3
 *
 */
public class FindQuotient {
    public static int solution(int num1, int num2) {
        int answer = num1/num2;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        do {
            System.out.println("두 정수 입력 : ");
            num1 = input.nextInt();
            num2 = input.nextInt();
        } while((0 > num1 && num1 > 100) || (0 > num2 && num2 > 100));
        System.out.println(solution(num1, num2));
    }
}
