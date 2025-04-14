package baekjoononline.euclideanalgorithm.brown;

import java.util.Scanner;

/**
 * Level : Brown 1
 * Title : 최대공약수와 최소공배수
 * 문제 유형 : 유클리드 호제법 Euclidean Algorithm
 *
 * Started : 2025-04-14
 * Solved : 2025-04-14
 *
 *
 */
public class boj2609GCDandLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(gcd(a, b) + " " + lcm(a, b));
    }

    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a*b/gcd(a, b);
    }
}
