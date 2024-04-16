package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 수 조작하기2
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-14
 * Solved : 2024-04-14
 *
 *
 */
public class ControlNum2 {
    public static String solution(int[] numLog) {
        String answer = "";
        for(int i = 1; i < numLog.length; ++i) {
            if(numLog[i] == numLog[i-1] + 1) {
                answer += "w";
            } else if (numLog[i] == numLog[i-1] - 1) {
                answer += "s";
            } else if(numLog[i] == numLog[i-1] + 10) {
                answer += "d";
            } else if(numLog[i] == numLog[i-1] - 10) {
                answer += "a";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] numLog = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            numLog[i] = Integer.parseInt(spStr[i]);
        }

        System.out.println(solution(numLog));
    }
}
