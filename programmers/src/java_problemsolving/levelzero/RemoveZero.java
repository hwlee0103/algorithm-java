package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 0 떼기
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-09-03
 * Solved : 2024-09-03
 *
 *
 */
public class RemoveZero {
    public static String solution(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
