package javabasic.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 두 수의 합
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-03-27
 * Solved : 2024-03-27
 *
 *
 */
public class SumOfTwoNums {
    public static int solution(int num1, int num2) {
        int answer = -1;
        return answer = num1 + num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = -50000;
        int n2 = -50000;

        do {
            n1 = input.nextInt();
        } while(n1> 50000 && n1 < -50000);

        do {
            n2 = input.nextInt();
        } while(n2> 50000 && n2 < -50000);

        System.out.println(solution(n1, n2));
    }
}
