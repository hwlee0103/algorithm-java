package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 여러 번 뒤집기
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-08
 * Solved : 2024-07-08
 *
 *
 */

public class FlippingString {
    public static String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; ++i) {
            String subString = "";
            subString = my_string.substring(queries[i][0], queries[i][1] + 1);
            String my_string_start = "";
            my_string_start = my_string.substring(0, queries[i][0]);
            String my_string_end = "";
            my_string_end = my_string.substring(queries[i][1] + 1, my_string.length());

            my_string = my_string_start;
            for(int j = subString.length() - 1; j >= 0; --j) {
                my_string += subString.charAt(j);
            }
            my_string += my_string_end;
        }

        return my_string;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        String str = input.nextLine();
        String[] spStr = str.split("], \\[");
        int[][] queries = new int[spStr.length][2];
        for(int i = 0; i < spStr.length; ++i) {
            spStr[i] = spStr[i].replaceAll("\\[", "");
            spStr[i] = spStr[i].replaceAll("]", "");
            String[] tmp = spStr[i].split(", ");
            queries[i][0] = Integer.valueOf(tmp[0]);
            queries[i][1] = Integer.valueOf(tmp[1]);
        }

        System.out.println(solution(my_string, queries));
    }
}
