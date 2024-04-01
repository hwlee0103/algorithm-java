package javabasic.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 두 수의 연산값 비교하기
 * 문제 유형 : 연산
 *
 * Started : 2024-04-01
 * Solved : 2024-04-01
 *
 *
 */
public class CompareTwoResults {
    public static int solution(int a, int b) {
        int answer = 0;

        int resOne = Integer.valueOf(String.valueOf(a).concat(String.valueOf(b)));
        int resTwo = 2 * a * b;

        return answer = (resOne >= resTwo) ? resOne : resTwo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(solution(a, b));
    }
}
