package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 간단한 식 계산하기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-19
 * Solved : 2024-08-19
 *
 *
 */
public class EvaluateSimpleExpressions {
    public static int solution(String binomial) {
        int answer = 0;
        String[] spBinomial = binomial.split(" ");
//        System.out.println("binomial : " + spBinomial[0] + " " + spBinomial[1] + " " + spBinomial[2] + " = ?");
        if(spBinomial[1].equals("+")) {
            answer = Integer.parseInt(spBinomial[0]) + Integer.parseInt(spBinomial[2]);
        } else if(spBinomial[1].equals("-")) {
            answer = Integer.parseInt(spBinomial[0]) - Integer.parseInt(spBinomial[2]);
        } else {
            answer = Integer.parseInt(spBinomial[0]) * Integer.parseInt(spBinomial[2]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
