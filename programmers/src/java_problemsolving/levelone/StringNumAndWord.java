package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 숫자 문자열과 영단어
 * 문제 유형 : 2021 카카오 채용연계형 인턴십
 *
 * Started : 2024-08-07
 * Solved : 2024-08-07
 *
 *
 */
public class StringNumAndWord {
    public static int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < 10; ++i) {
            s = s.replaceAll(numbers[i], String.valueOf(i));
        }
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(solution(s));
    }
}
