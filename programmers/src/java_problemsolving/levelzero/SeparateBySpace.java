package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 공백으로 구분하기 1
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-16
 * Solved : 2024-08-16
 *
 *
 */
public class SeparateBySpace {
    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextLine())));
    }
}
