package baekjoononline.dynamicprogramming.blue;

import java.util.Scanner;

/**
 * Level : Blue 5
 * Title : 1010 다리놓기
 * 문제 유형 : 동적 계획법 Dynamic Programming
 *
 * Started : 2025-04-11
 * Solved : 2025-
 *
 *
 *
 *
 */

public class boj1010BuildingBridges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[][] queries = new int[t][2];
        for(int i=0; i<t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            queries[i][0] = n;
            queries[i][1] = m;
        }

        for(int i=0; i<t; i++) {
            
        }
    }
}
