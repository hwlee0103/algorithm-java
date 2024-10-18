package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 문자열 뒤집기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-24
 * Solved : 2024-04-24
 *
 *
 */
public class FilpStringArray {
    public static String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); ++i) {
            answer += my_string.charAt(my_string.length()-i-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
