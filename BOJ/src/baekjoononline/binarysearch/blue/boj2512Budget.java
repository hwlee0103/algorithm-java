package baekjoononline.binarysearch.blue;

import java.util.Scanner;

/**
 * Level : Blue 2
 * Title : 2512 예산
 * 문제 유형 : 이분 탐색 Binary Search
 *
 * Started : 2025-01-13
 * Solved : 2025-01-
 *
 *
 */

public class boj2512Budget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] budgets = new int[n];
        int sum = 0;
        int maxBudget = 0;
        for(int i=0; i<n; i++) {
            budgets[i] = input.nextInt();
            sum += budgets[i];
            maxBudget = Math.max(maxBudget, budgets[i]);
        }
        int totalBudget = input.nextInt();

        if(totalBudget >= sum) {
            System.out.println(maxBudget);
        } else {
            // binary search

        }
    }

    public static int binarySearch(int[] budgets, int total) {
        int maxBudget = 0;
        int low = 1;
        int high = total;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            int sum = 0;
            for(int i = 0; i < budgets.length; i++) {
                if(budgets[i] > mid) {
                    sum += mid;
                } else {
                    sum += budgets[i];
                }
            }

            if(sum > total) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }

        return maxBudget;
    }

}
