package java_problemsolving.levelzero.introductionsofps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 정렬하기 (2)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-26
 * Solved : 2024-05-26
 *
 *
 */
public class SortString2 {
    public static String solution(String my_string) {
        char[] str = my_string.toLowerCase().toCharArray();
        Arrays.sort(str);
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
