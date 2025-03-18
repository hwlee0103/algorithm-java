package baekjoononline.implementation.brown;

import java.util.Scanner;

/**
 * Level : Brown 5
 * Title : 27866 문자와 문자열
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-03-18
 * Solved : 2025-03-18
 *
 *
 *
 *
 */

public class boj27866LettersAndStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = input.nextInt();
        System.out.println(str.charAt(n - 1));
    }
}
