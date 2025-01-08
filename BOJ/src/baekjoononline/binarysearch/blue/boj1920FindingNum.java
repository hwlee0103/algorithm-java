package baekjoononline.binarysearch.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 4
 * Title : 1920 수 찾기
 * 문제 유형 : 이분 탐색 Binary Search
 *
 * Started : 2025-01-07
 * Solved : 2025-01-07
 *
 *
 */
public class boj1920FindingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arrA = new int[n];
        for(int i=0; i<n; i++) {
            arrA[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] arrM = new int[m];
        for(int i=0; i<m; i++) {
            arrM[i] = input.nextInt();
        }

        Arrays.sort(arrA);

        for(int i = 0; i < m; ++i) {
            System.out.println(binarySearch(arrA, arrM[i]));
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int answer = 0;
        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) {
                answer = 1;
                break;
            }
            if(arr[mid] < target) {
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }

        return answer;
    }
}
