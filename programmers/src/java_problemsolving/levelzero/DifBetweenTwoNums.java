package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 두 수의 차
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-21
 * Solved : 2024-04-21
 *
 *
 */
public class DifBetweenTwoNums {
    public static int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(solution(num1, num2));
    }
}
