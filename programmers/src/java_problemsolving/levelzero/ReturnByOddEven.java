package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 홀짝에 따라 다른 값 반환하기
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-04
 * Solved : 2024-04-04
 *
 *
 */
public class ReturnByOddEven {
    public static int solution(int n) {
        int answer = 0;
        if(n%2==0) {
            for(int i = 2; i <= n; i+=2) {
                answer += i*i;
            }
        } else {
            for(int i = 1; i <= n; i+=2) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(solution(n));
    }

}
