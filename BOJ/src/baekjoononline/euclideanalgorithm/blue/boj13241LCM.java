package baekjoononline.euclideanalgorithm.blue;

import java.util.Scanner;

/**
 * Level : Blue 5
 * Title : LCM
 * 문제 유형 : 유클리드 호제법 Euclidean Algorithm
 *
 * Started : 2025-04-08
 * Solved : 2025-04-
 *
 *
 */
public class boj13241LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextInt();
        long b = input.nextInt();
        System.out.println(lcm(a, b));
    }

    public static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
