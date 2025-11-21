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
            long tmpSum = sum;
            long now = i;
            sum = 0;
            while(tmpSum > 0 || now > 0) {
                sum += tmpSum % 10;
                tmpSum /= 10;
                sum += now % 10;
                now /= 10;
            }
        }
        System.out.println(sum);
    }
}
