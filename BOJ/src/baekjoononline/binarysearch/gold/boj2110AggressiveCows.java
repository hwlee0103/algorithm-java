package baekjoononline.binarysearch.gold;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Gold 4
 * Title : 2110 공유기 설치 Aggressive Cow
 * 문제 유형 : 이분 탐색 Binary Search / 파라메트릭 서치 Parametric Search
 *
 * Started : 2025-07-23
 * Solved : 2025-0
 *
 *
 */
public class boj2110AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // 가능한 거리 범위
        int left = 1;
        int right = arr[N - 1] - arr[0];

        while(left <= right) {
            int mid = (left + right) / 2;
            
        }

    }
}
