package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 세로 읽기
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-12
 * Solved : 2024-07-12
 *
 *
 */
public class ReadingTopdown {
    public static String solution(String my_string, int m, int c) {
        String answer = "";
        ArrayList<String> strs = new ArrayList<>();

        int idx = 0;
        for(int i = 0; i < my_string.length(); i += m) {
            String now = my_string.substring(i, i+m);
            answer += now.charAt(c - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        int m = input.nextInt();
        int c = input.nextInt();
        System.out.println(solution(my_string, m, c));
    }
}
