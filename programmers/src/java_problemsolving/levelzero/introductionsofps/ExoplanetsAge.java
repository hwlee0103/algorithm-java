package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 외계행성의 나이
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-29
 * Solved : 2024-04-29
 *
 *
 */
public class ExoplanetsAge {
    public static String solution(int age) {
        String answer = "";
        while(age > 0) {
            answer = (char)(age%10 + 'a') + answer;
            age /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println(solution(age));
    }
}
