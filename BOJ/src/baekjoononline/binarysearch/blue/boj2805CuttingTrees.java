package baekjoononline.binarysearch.blue;

import java.util.Scanner;

/**
 * Level : Blue 2
 * Title : 2805 나무 자르기
 * 문제 유형 : 이분 탐색 Binary Search
 *
 * Started : 2025-01-17
 * Solved : 2025-01-17
 *
 *
 */

public class boj2805CuttingTrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long m = input.nextLong();
        long[] trees = new long[n];
        long maxTree = 0;
        for(int i=0; i<n; i++) {
            trees[i] = input.nextLong();
            maxTree = Math.max(maxTree, trees[i]);
        }

        long answer = binarySearch(m, maxTree, trees);
        System.out.println(answer);
    }

    public static long binarySearch(long target, long maxTree, long[] trees) {
        long answer = 0;
        long left = 0;
        long right = maxTree;

        while(left <= right) {
            long mid = left + (right - left) / 2;

            long lumber = 0;
            for(int i = 0; i < trees.length; i++) {
                lumber += (trees[i] - mid > 0) ? (trees[i] - mid) : 0;
            }

            if(lumber >= target) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }
}
