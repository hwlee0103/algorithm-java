package baekjoononline.binarysearch.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 5
 * Title : 10815 숫자 카드
 * 문제 유형 : 이분 탐색 Binary Search
 *
 * Started : 2025-01-08
 * Solved : 2025-01-08
 *
 *
 */
public class boj10815NumberCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] card = new int[n];
        for(int i=0; i<n; i++) {
            card[i] = input.nextInt();
        }
        Arrays.sort(card);

        int m = input.nextInt();
        for(int i=0; i<m; i++) {
            int query = input.nextInt();
            System.out.println(binarySearch(card, query));
        }

    }

    public static int binarySearch(int[] nums, int target) {
        int answer = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                answer = 1;
                break;
            }
            if(nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}
