package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 더 크게 합치기
 * 문제 유형 : 연산
 *
 * Started : 2024-03-28
 * Solved : 2024-03-28
 *
 *
 */
public class CombineBigger {
    public static int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        answer = Integer.valueOf(ab) >= Integer.valueOf(ba) ? Integer.valueOf(ab) : Integer.valueOf(ba);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(solution(a, b));
    }
}
