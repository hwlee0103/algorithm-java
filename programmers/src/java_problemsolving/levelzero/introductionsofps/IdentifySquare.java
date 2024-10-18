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
