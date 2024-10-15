package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 자릿수 더하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-22
 * Solved : 2024-05-22
 *
 *
 */
public class AddDigits {
    public static int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
