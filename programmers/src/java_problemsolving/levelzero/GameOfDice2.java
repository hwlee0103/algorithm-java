package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 주사위 게임 2
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-08
 * Solved : 2024-04-08
 *
 *
 */
public class GameOfDice2 {
    public static int solution(int a, int b, int c) {
        int answer = 0;

        if(a == b && b == c) {
            answer += (a+b+c)*(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))*(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        } else if((a == b && b != c) || (a == c && a != b) || (b == c && a != c)) {
            answer += (a+b+c)*(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if(a != b && b != c && a != c) {
            answer += a+b+c;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println(solution(a, b, c));
    }
}
