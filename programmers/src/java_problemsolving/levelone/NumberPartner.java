package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 숫자 짝꿍
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-29
 * Solved : 2024-10-29
 *
 *
 */
public class NumberPartner {
    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] numX = new int[10];
        int[] numY = new int[10];
        for(int i = 0; i < X.length(); ++i) {
            numX[X.charAt(i) - '0']++;
        }
        for(int i = 0; i < Y.length(); ++i) {
            numY[Y.charAt(i) - '0']++;
        }

        for(int i = 9; i >= 0; --i) {
            if(numX[i] <= 0 || numY[i] <= 0) continue;
            int minCnt = Math.min(numX[i], numY[i]);
            for(int j = 0; j < minCnt; ++j) {
                answer.append(i);
            }
        }

        if(answer.length() == 0) return "-1";
        else if(answer.charAt(0) == '0') return "0";
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
