package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 편지
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-17
 * Solved : 2024-05-17
 *
 *
 */
public class Letter {
    public static int solution(String message) {
        return message.length() * 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        System.out.println(solution(message));
    }
}
