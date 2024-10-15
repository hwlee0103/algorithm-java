package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 분수의 덧셈
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-22
 * Solved : 2024-04-22
 *
 *
 */
public class AddingFraction {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = 0;
        int denom = 1;
        if(denom1==denom2) {
            numer = numer1 + numer2;
            denom = denom1;
        } else {
            numer = numer1*denom2 + numer2*denom1;
            denom = denom1*denom2;
        }
        int greatestCommonDivisor = gcd(numer, denom);
        answer[0] = numer/greatestCommonDivisor;
        answer[1] = denom/greatestCommonDivisor;
        return answer;
    }

    // 최대공약수 : 유클리드 호제법
    public static int gcd(int p, int q) {
        if(q == 0) return p;
        return gcd(q, p%q);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numer1 = input.nextInt();
        int denom1 = input.nextInt();
        int numer2 = input.nextInt();
        int denom2 = input.nextInt();
        int[] answer = solution(numer1, denom1, numer2, denom2);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
