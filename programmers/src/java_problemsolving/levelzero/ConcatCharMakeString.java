package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 글자 이어 붙여 문자열 만들기
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-07
 * Solved : 2024-07-07
 *
 *
 */
public class ConcatCharMakeString {
    public static String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i = 0; i < index_list.length; ++i ) {
            answer += String.valueOf(my_string.charAt(index_list[i]));
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] index_list = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            index_list[i] = Integer.valueOf(spStr[i]);
        }

        System.out.println(solution(my_string, index_list));
    }
}
