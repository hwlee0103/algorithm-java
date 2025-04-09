package baekjoononline.euclideanalgorithm.blue;

import java.util.Scanner;

/**
 * Level : Blue 4
 * Title : Sum of GCD
 * 문제 유형 : 유클리드 호제법 Euclidean Algorithm
 *
 * Started : 2025-04-09
 * Solved : 2025-04-09
 *
 *
 */

public class boj9613SumOfGCD {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int t = input.nextInt();
        int[][] queries = new int[t][];
        for(int i = 0; i < t; ++i) {
            int a = input.nextInt();
            queries[i] = new int[a];
            for(int j = 0; j < a; j++) {
                queries[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < queries.length; ++i) {
            long sum = 0;
            for(int j = 0; j < queries[i].length; ++j) {
                for(int k = j+1; k < queries[i].length; ++k) {
                    sum += gcd(queries[i][j], queries[i][k]);
                }
            }
            System.out.println(sum);
        }

    }

    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a % b);
    }
}
