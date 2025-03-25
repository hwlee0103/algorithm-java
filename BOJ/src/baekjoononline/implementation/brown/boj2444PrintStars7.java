package baekjoononline.implementation.brown;

import java.util.Scanner;

/**
 * Level : Brown 3
 * Title : 2444 별 찍기 - 7
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-03-25
 * Solved : 2025-03-
 *
 *
 *
 *
 */

public class boj2444PrintStars7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1;i <= 2*n-1; ++i) {
            for(int j = 1; j <= 2*n-1; ++j) {
                int x = 2 * i - 1;
                int y = ((2 * j - 1) - x) /2;
                if(j <= y) {
                    System.out.print(" ");
                } else if(j <= x) {
                    System.out.print("*");
                } else System.out.println();
            }
        }
    }
}
