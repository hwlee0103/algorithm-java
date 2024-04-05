package javabasic.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 코드 처리하기
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-05
 * Solved : 2024-04-05
 *
 *
 */
public class SolvingCode {
    public static String solution(String code) {
        String answer = "";
        int mode = 0;

        for(int i = 0; i < code.length(); ++i) {
            if(mode == 0) {
                if(code.charAt(i) != '1') {
                    if(i%2==0) {
                        answer += code.charAt(i);
                    }
                } else {
                    mode = 1;
                }
            } else {
                if(code.charAt(i) != '1') {
                    if(i%2!=0) {
                        answer += code.charAt(i);
                    }
                } else {
                    mode = 0;
                }
            }
        }

        if(answer.equals("")) answer = "EMPTY";
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String code = input.nextLine();

        System.out.println(solution(code));
    }
}
