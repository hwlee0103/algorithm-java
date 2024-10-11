package java_problemsolving.pcceproblems;

import java.util.Scanner;

/**
 * Level : 0
 * Title : [PCCE 기출문제] 3번 / 수 나누기
 * 문제 유형 : [PCCE 기출문제]
 *
 * Started : 2024-10-11
 * Solved : 2024-10-11
 *
 *
 */
public class DividingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        while(number > 0){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
