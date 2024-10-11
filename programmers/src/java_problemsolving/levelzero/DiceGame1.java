package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 주사위 게임 1
 * 문제 유형 : 조건문 활용
 *
 * Started : 2024-09-10
 * Solved : 2024-09-10
 *
 *
 */
public class DiceGame1 {
    public static int solution(int a, int b) {
        int answer = 0;
        if(a%2 != 0 && b%2 != 0) {
            answer = (int)(Math.pow(a, 2) + Math.pow(b, 2));
        } else if(a%2 != 0 && b%2 == 0
                || a%2 == 0 && b%2 != 0) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextInt(), input.nextInt()));
    }
}
