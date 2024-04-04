package javabasic.levelzero;

import groovy.console.ui.ScriptToTreeNodeAdapter;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 공배수
 * 문제 유형 : 연산
 *
 * Started : 2024-04-04
 * Solved : 2024-04-04
 *
 *
 */
public class CommonMultiple {
    public static int solution(int number, int n, int m) {
        return (number%n == 0 && number%m == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println(solution(number, n, m));
    }
}
