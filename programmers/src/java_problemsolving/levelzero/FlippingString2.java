package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 뒤집기
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-12
 * Solved : 2024-07-12
 *
 *
 */
public class FlippingString2 {
    public static String solution(String my_string, int s, int e) {
        String answer = "";
        String tmp = my_string.substring(s, e + 1);
        answer = my_string.substring(0, s);
        for(int i = tmp.length() - 1; i >= 0; --i ) {
            answer += tmp.charAt(i);
        }
        answer += my_string.substring(e+1, my_string.length());

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        int s = input.nextInt();
        int e = input.nextInt();
        System.out.println(solution(my_string, s, e));
    }
}
