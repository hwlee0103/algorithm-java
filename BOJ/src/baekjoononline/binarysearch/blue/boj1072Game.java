package baekjoononline.binarysearch.blue;

import java.util.Scanner;

/**
 * Level : Blue 3
 * Title : 1072 게임
 * 문제 유형 : 이분 탐색 Binary Search
 *
 * Started : 2025-01-21
 * Solved : 2025-01-21
 *
 *
 */

public class boj1072Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();
        long y = input.nextLong();
        double z = Math.floor(((double)y * 100) / (double)x); // 부동소수점 주의!
        long answer = binarySearch(1, 1000000000, z, x, y);
        if(answer == 0) System.out.println("-1");
        else System.out.println(answer);
    }

    public static long binarySearch(long left, long right, double z, long x, long y) {
        long answer = 0;
        while(left <= right) {
            long mid = left + (right - left) / 2;
            double now = Math.floor(((double)(y + mid) * 100) / (x + mid)); // 부동소수점 주의!
            if(z == now) {
                left = mid + 1;
            } else {
                answer = mid;
                right = mid - 1;
            }
        }

        return answer;
    }
}
