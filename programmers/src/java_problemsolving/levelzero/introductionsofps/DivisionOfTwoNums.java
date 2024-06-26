package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 두 수의 나눗셈
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-21
 * Solved : 2024-04-21
 *
 * 문제
 * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ num1 ≤ 100
 * 0 ≤ num2 ≤ 100
 *
 * 입출력 예
 * num1	num2	result
 * 3	2	    1500
 * 7	3	    2333
 * 1	16	    62
 *
 */
public class DivisionOfTwoNums {
    public static int solution(int num1, int num2) {
        int answer = num1 * 1000 / num2;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(solution(num1, num2));
    }
}
