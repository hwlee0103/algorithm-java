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
 * 문제
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 <numer1, denom1, numer2, denom2 < 1,000
 *
 * 입출력 예
 * numer1	denom1	numer2	denom2	result
 * 1	    2	    3	    4	    [5, 4]
 * 9	    2	    1	    3	    [29, 6]
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
