package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 꼬리 문자열
 * 문제 유형 : 조건문 활용
 *
 * Started : 2024-09-09
 * Solved : 2024-09-09
 *
 *
 */
public class TailString {
    public static String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; ++i) {
            if(!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine().replaceAll("\"", "").split(", "), input.nextLine()));
    }
}
