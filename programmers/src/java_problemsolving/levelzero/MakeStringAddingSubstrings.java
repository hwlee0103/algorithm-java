package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 부분 문자열 이어 붙여 문자열 만들기
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-10
 * Solved : 2024-07-10
 *
 *
 */
public class MakeStringAddingSubstrings {
    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i = 0; i < my_strings.length; ++i) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("\"", "");
        String[] my_strings = str.split(", ");
        String strParts = input.nextLine();
        String[] spStr = strParts.split("], \\[");
        int[][] parts = new int[spStr.length][2];
        for(int i = 0; i < spStr.length; ++i) {
            String now = spStr[i].replaceAll("\\[", "");
            now = now.replaceAll("]", "");
            String[] nowSp = now.split(", ");
            parts[i][0] = Integer.valueOf(nowSp[0]);
            parts[i][1] = Integer.valueOf(nowSp[1]);
        }

        System.out.println(solution(my_strings, parts));
    }
}
