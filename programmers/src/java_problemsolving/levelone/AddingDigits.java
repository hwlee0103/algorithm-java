package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 자릿수 더하기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-04-16
 * Solved : 2024-04-16
 *
 *
 */
public class AddingDigits {
    public static int solution(int n) {
        int answer = 0;

        do {
            answer += n%10;
            n/=10;
        } while(n > 0);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
