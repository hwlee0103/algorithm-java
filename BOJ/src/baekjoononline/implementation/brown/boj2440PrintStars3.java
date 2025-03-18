package baekjoononline.implementation.brown;

import java.util.Scanner;

/**
 * Level : Brown 4
 * Title : 2440 별 찍기 - 3
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-03-11
 * Solved : 2025-03-11
 *
 *
 *
 *
 */

public class boj2440PrintStars3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
