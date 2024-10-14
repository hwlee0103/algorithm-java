package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열에서 문자열 대소문자 변환하기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-08
 * Solved : 2024-08-08
 *
 *
 */
public class ChangeStringCaseInArray {
    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0;i < strArr.length; ++i) {
            String now = strArr[i];
            if(i%2 == 0) {
                now = now.toLowerCase();
            } else {
                now = now.toUpperCase();
            }
            answer[i] = now;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] answer = solution(input.nextLine().replaceAll("\"", "").split(","));
        System.out.println(Arrays.toString(answer));
    }
}
