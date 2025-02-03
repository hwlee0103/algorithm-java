package baekjoononline.implementation.brown;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Brown 2
 * Title : 2750 수 정렬하기
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-02-03
 * Solved : 2025-
 *
 *
 */

public class boj2750NumberSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
