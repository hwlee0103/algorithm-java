package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 모음 제거
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-06
 * Solved : 2024-05-06
 *
 *
 */
public class RemoveVowels {
    public static String solution(String my_string) {
        // my_string = my_string.replaceAll("a", "");
        // my_string = my_string.replaceAll("e", "");
        // my_string = my_string.replaceAll("i", "");
        // my_string = my_string.replaceAll("o", "");
        // my_string = my_string.replaceAll("u", "");
        my_string = my_string.replaceAll("[aeiou]", "");
        return my_string;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
