package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 다항식 더하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-29
 * Solved : 2024-05-31
 *
 *
 */
public class AddingPolynomial {
    public static String solution(String polynomial) {
        String answer = "";
        String[] spPoly = polynomial.split(" ");
        int xNum = 0;
        int num = 0;
        for(int i = 0; i < spPoly.length; ++i) {
            String now = spPoly[i];
            if(now.equals("+")) continue;
            if(now.indexOf("x") > -1) {
                if(now.length() == 1) xNum++;
                else xNum += Integer.parseInt(now.substring(0, now.length()-1));
            } else {
                num += Integer.parseInt(now);
            }
        }

        if(xNum > 1) {
            if(num != 0) answer = String.valueOf(xNum) + "x + " + String.valueOf(num);
            else answer = String.valueOf(xNum) + "x";
        } else if(xNum == 1) {
            if(num != 0) answer = "x + " + String.valueOf(num);
            else answer = "x";
        } else {
            if(num != 0) answer = String.valueOf(num);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String polynomial = input.nextLine();
        System.out.println(solution(polynomial));
    }
}
