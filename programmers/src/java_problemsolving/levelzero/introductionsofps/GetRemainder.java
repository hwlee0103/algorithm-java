package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 나머지 구하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-22
 * Solved : 2024-04-22
 *
 * 문제
 * 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 < num1 ≤ 100
 * 0 < num2 ≤ 100
 *
 * 입출력 예
 * num1	num2	result
 * 3	2	    1
 * 10	5	    0
 *
 */
public class GetRemainder {
    public static int solution(int num1, int num2) {
        return num1%num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(solution(num1,num2));
    }
}
