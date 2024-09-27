package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 두 수의 합
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-09-03
 * Solved : 2024-09-03
 *
 *
 */
public class SumOfTwoNums {
    public static String solution(String a, String b) {
        String answer = "";
        int aLen = a.length();
        int bLen = b.length();
        int flag = 0;
        while(aLen > 0 || bLen > 0) {
            int nowA = 0;
            int nowB = 0;
            if(aLen > 0) {
                nowA = Integer.parseInt(a.substring(aLen - 1, aLen));
                aLen--;
            }
            if(bLen > 0) {
                nowB = Integer.parseInt(b.substring(bLen - 1, bLen));
                bLen--;
            }
            int now = nowA + nowB + flag;
            if(now >= 10) {
                answer = String.valueOf(now%10) + answer;
                flag = now/10;
            } else {
                answer = String.valueOf(now) + answer;
                flag = 0;
            }
        }
        if(flag == 1) {
            answer = String.valueOf(flag) + answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
