package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 나머지 구하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-22
 * Solved : 2024-04-22
 *
 * 
 */
public class GetRemainder {
    public static int solution(int num1, int num2) {
        return num1%num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(solution(num1,num2));
    }
}
