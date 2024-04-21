package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 두 수의 곱
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-21
 * Solved : 2024-04-21
 *
 * 문제
 * 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ num1 ≤ 100
 * 0 ≤ num2 ≤ 100
 *
 * 입출력 예
 * num1	num2	result
 * 3	4	    12
 * 27	19	    513
 *
 */
public class MultiplyOfTwoNums {
    public static int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(solution(num1, num2));
    }
}
