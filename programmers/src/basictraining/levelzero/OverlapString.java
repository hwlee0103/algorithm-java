package basictraining.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 겹쳐쓰기
 * 문제 유형 : 연산
 *
 * Started : 2024-03-24
 * Solved : 2024-03-24
 *
 *
 */
public class OverlapString {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
//        answer = my_string.replace(my_string.substring(s, s + overwrite_string.length()), overwrite_string);
        answer = my_string.substring(0, s);
        answer += overwrite_string;
        if(answer.length() < my_string.length()) {
            answer += my_string.substring(s + overwrite_string.length());
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        String overwriteString = input.nextLine();
        int index = input.nextInt();

        System.out.println(solution(myString, overwriteString, index));
    }
}
