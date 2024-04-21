package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 숫자 비교하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-21
 * Solved : 2024-04-21
 *
 * 문제
 * 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ num1 ≤ 10,000
 * 0 ≤ num2 ≤ 10,000
 *
 * 입출력 예
 * num1	num2	result
 * 2	3	-1
 * 11	11	1
 * 7	99	-1
 *
 */
public class CompareNums {
    public static int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(solution(num1, num2));
    }
}
