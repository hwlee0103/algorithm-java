package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 바꿔서 찾기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-20
 * Solved : 2024-08-20
 *
 *
 */
public class SwitchAndFindString {
    public static int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i < myString.length(); ++i) {
            if(myString.charAt(i) == 'A') {
                myString = myString.substring(0, i) + 'B' + myString.substring(i + 1, myString.length());
            } else if(myString.charAt(i) == 'B') {
                myString = myString.substring(0, i) + 'A' + myString.substring(i + 1, myString.length());
            }
        }
        if(myString.indexOf(pat) > -1) {
            answer = 1;
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
