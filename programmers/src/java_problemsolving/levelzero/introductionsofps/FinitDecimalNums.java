package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 유한소수 판별하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-09
 * Solved : 2024-06-09
 *
 *
 */
public class FinitDecimalNums {
    public static int solution(int a, int b) {
        int answer = 0;

        for(int i = b; i > 1; --i) {
            if(a%i == 0 && b%i == 0) {
                a /= i;
                b /= i;
            }
        }

        while(b > 1) {
            if(b%2==0) b/=2;
            else if(b%5==0) b/=5;
            else break;
        }

        if(b == 1) answer = 1;
        else answer = 2;

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(solution(a, b));
    }
}
