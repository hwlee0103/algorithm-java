package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 피자 나눠 먹기 (2)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-23
 * Solved : 2024-04-23
 *
 *
 */
public class SharePizza2 {
    public static int solution(int n) {
        int answer = lcm(n, 6)/6;
        return answer;
    }

    // 최대공약수 : 유클리드 호제법
    public static int gcd(int p, int q) {
        if(q == 0) return p;
        return gcd(q, p%q);
    }

    //최소공배수 : 유클리드 호제법
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
