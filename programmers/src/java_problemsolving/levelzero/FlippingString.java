package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 여러 번 뒤집기
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-08
 * Solved : 2024-07-
 *
 * 문제
 * 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
 * queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
 * my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * my_string은 영소문자로만 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 * queries의 원소는 [s, e]의 형태로 0 ≤ s ≤ e < my_string의 길이를 만족합니다.
 * 1 ≤ queries의 길이 ≤ 1,000
 *
 * 입출력 예
 * my_string	    queries	                            result
 * "rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"
 *
 * 입출력 예 설명
 * 예제 1번의 my_string은 "rermgorpsam"이고 주어진 queries를 순서대로 처리하면 다음과 같습니다.
 *
 * queries	my_string
 * "rermgorpsam"
 * [2, 3]	"remrgorpsam"
 * [0, 7]	"progrmersam"
 * [5, 9]	"prograsremm"
 * [6, 10]	"programmers"
 * 따라서 "programmers"를 return 합니다.
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
