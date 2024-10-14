package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 부분 문자열인지 확인하기
 * 문제 유형 : 조건문 활용
 *
 * Started : 2024-09-06
 * Solved : 2024-09-06
 *
 *
 */
public class CheckIfSubstring {
    public static int solution(String my_string, String target) {
        return my_string.indexOf(target) > -1 ? 1 : 0;
//        return my_string.contains(target) > -1 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
