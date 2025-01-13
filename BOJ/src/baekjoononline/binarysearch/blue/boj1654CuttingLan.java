package baekjoononline.binarysearch.blue;

import java.util.Scanner;

/**
 * Level : Blue 2
 * Title : 1654 랜선 자르기
 * 문제 유형 : 이분 탐색 Binary Search
 *
 * Started : 2025-01-10
 * Solved : 2025-01-13
 *
 *
 */

public class boj1654CuttingLan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        long n = input.nextLong();
        long[] arr = new long[k];
        long maxLen = 0;
        for(int i=0; i<k; i++) {
            arr[i] = input.nextInt();
            maxLen = Math.max(maxLen, arr[i]);
        }

        long low = 1, high = maxLen + 1; // upper bound
        long mid = low + (high - low) / 2;
        while(low < high) {
            // count
            long cnt = 0;
            for(int i = 0; i < arr.length; i++) {
                cnt += arr[i]/mid;
            }

            if(cnt >= n) {
                low = mid + 1;
            } else {
                high = mid;
            }

            mid = low + (high - low) / 2;
        }
        System.out.println(mid - 1);
    }
}
