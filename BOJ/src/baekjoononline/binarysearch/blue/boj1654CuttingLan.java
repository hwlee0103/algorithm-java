package baekjoononline.binarysearch.blue;

import java.util.Scanner;

/**
 * Level : Blue 2
 * Title : 1654 랜선 자르기
 * 문제 유형 : 이분 탐색 Binary Search
 *
 * Started : 2025-01-10
 * Solved : 2025-01-
 *
 *
 */

public class boj1654CuttingLan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        int[] arr = new int[n];
        int maxLen = 0;
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
            maxLen = Math.max(maxLen, arr[i]);
        }

        
    }
}
