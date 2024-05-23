package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 제곱수 판별하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-23
 * Solved : 2024-05-23
 *
 * 문제
 * 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
 * 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 1,000,000
 *
 * 입출력 예
 * n	result
 * 144	1
 * 976	2
 *
 */
public class IdentifySquare {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 1000; ++i) {
            if(i*i == n) {
                answer = 1;
                break;
            }
            else answer = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));;
    }
}
