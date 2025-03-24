package baekjoononline.implementation.brown;

import java.util.Scanner;

/**
 * Level : Brown 5
 * Title : 9086 문자열
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-03-24
 * Solved : 2025-03-
 *
 *
 *
 *
 */

public class boj9086String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; i++) {
            String s = input.nextLine();
            String ans = String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(s.length() - 1));
            System.out.println(ans);
        }

    }
}
