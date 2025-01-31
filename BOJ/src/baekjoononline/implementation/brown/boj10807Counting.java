package baekjoononline.implementation.brown;

import java.util.Scanner;

/**
 * Level : Brown 5
 * Title : 10807 개수 세기
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-01-31
 * Solved : 2025-01-31
 *
 *
 */

public class boj10807Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == v) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
