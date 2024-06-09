package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 유한소수 판별하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-09
 * Solved : 2024-06-
 *
 * 문제
 * 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
 *
 * 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
 * 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * a, b는 정수
 * 0 < a ≤ 1,000
 * 0 < b ≤ 1,000
 *
 * 입출력 예
 * a	b	result
 * 7	20	1
 * 11	22	1
 * 12	21	2
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
