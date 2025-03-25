package baekjoononline.implementation.brown;

import java.util.Scanner;

/**
 * Level : Brown 3
 * Title : 2441 별 찍기 - 4
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-03-21
 * Solved : 2025-03-21
 *
 *
 *
 *
 */

public class boj2441PrintStars4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n; ++i) {
            int j = 0;
            for(j = 0; j < i; ++j) {
                System.out.print(" ");
            }
            for(int k = j; k < n; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
