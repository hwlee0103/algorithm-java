package baekjoononline.binarysearch.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 4
 * Title : 10816 숫자 카드 2
 * 문제 유형 : 이분 탐색 Binary Search
 *
 * Started : 2025-01-09
 * Solved : 2025-01-09
 *
 *
 */

public class boj10816NumberCard2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] cards = new int[N];
        for(int i=0; i<N; i++) {
            cards[i] = input.nextInt();
        }
        int M = input.nextInt();
        int[] query = new int[M];
        for(int i=0; i<M; i++) {
            query[i] = input.nextInt();
        }

        Arrays.sort(cards);

        int upper = 0;
        int lower = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++) {
            // upper bound
            upper = upperBoundBinarySearch(cards, query[i]);
            // lower bound
            lower = lowerBoundBinarySearch(cards, query[i]);
            // upper - lower
//            System.out.print(upper - lower + " ");
            sb.append(upper - lower).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static int upperBoundBinarySearch(int[] nums, int target) {
        int low = 0, high = nums.length; //상한, 하한 구할 시에는 left = right일 때 return해야하므로

        while(low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }

    public static int lowerBoundBinarySearch(int[] nums, int target) {
        int low = 0, high = nums.length;

        while(low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
