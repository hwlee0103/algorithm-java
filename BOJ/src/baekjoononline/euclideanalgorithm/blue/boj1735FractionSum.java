package baekjoononline.euclideanalgorithm.blue;

import java.util.Scanner;

/**
 * Level : Blue 3
 * Title : 분수 합
 * 문제 유형 : 유클리드 호제법 Euclidean Algorithm
 *
 * Started : 2025-04-14
 * Solved : 2025-04-14
 *
 *
 */

public class boj1735FractionSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numerator = new int[2];
        int[] denominator = new int[2];
        numerator[0] = input.nextInt();
        denominator[0] = input.nextInt();
        numerator[1] = input.nextInt();
        denominator[1] = input.nextInt();

        int[] answer = new int[2];
        answer[1] = lcm(denominator[0], denominator[1]);
        answer[0] = (answer[1]/denominator[0]) * numerator[0] + (answer[1]/denominator[1]) * numerator[1];

        System.out.println(answer[0]/gcd(answer[0],answer[1]) + " " + answer[1]/gcd(answer[0],answer[1]));
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
