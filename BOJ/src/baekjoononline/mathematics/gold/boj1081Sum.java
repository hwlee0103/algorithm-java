package baekjoononline.mathematics.gold;

import java.util.Scanner;

/**
 * Level : Gold 1
 * Title : 합 Sum
 * Topic : Mathematics
 *
 * Started : 2025-11-21
 * Solved : 2025-11-
 * Time: -
 * Algorithm: Mathematics
 * RE; 시간초과됨
 *
 *
 *
 */

public class boj1081Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long u = sc.nextLong();

        long sum = 0;
        for(long i = l; i <= u; ++i) {
            long now = i;
            while(now > 0) {
                sum += now % 10;
                now /= 10;
            }
        }
        System.out.println(sum);
    }
}
