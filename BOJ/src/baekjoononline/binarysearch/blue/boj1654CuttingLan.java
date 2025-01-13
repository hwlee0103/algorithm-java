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
        long n = input.nextLong();
        long[] arr = new long[k];
        long maxLen = 0;
        for(int i=0; i<k; i++) {
            arr[i] = input.nextInt();
            maxLen = Math.max(maxLen, arr[i]);
        }

        long low = 1, high = maxLen;
        long answer = 0;
        long mid = low + (high - low) / 2;
        while(low < high) {
            // count
            int cnt = 0;
            for(int i = 0; i < arr.length; i++) {
                cnt += arr[i]/mid;
            }

            if(cnt >= n) {
                if(cnt == n) answer = Math.max(answer, mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = low + (high - low) / 2;
        }
        System.out.println(answer);
    }
}
