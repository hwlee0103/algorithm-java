package baekjoononline.euclideanalgorithm.brown;

import java.util.Scanner;

/**
 * Level : Brown 1
 * Title : 최소공배수
 * 문제 유형 : 유클리드 호제법 Euclidean Algorithm
 *
 * Started : 2025-04-07
 * Solved : 2025-04-07
 *
 *
 */

public class boj1934LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[][] queries = new int[t][2];
        for(int i = 0; i < t; i++) {
            queries[i][0] = input.nextInt();
            queries[i][1] = input.nextInt();
        }

        for(int i = 0; i < queries.length; ++i) {
            // 최대공약수
            int gcdVal = gcd(Math.max(queries[i][0], queries[i][1]), Math.min(queries[i][0], queries[i][1]));
            // 최소공배수
            int result = queries[i][0] * (queries[i][1] / gcdVal);

            System.out.println(result);
        }

    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
