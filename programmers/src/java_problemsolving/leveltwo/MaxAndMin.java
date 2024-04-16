package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 최댓값과 최솟값
 * 문제 유형 : 연습문제
 *
 * Started : 2024-04-15
 * Solved : 2024-04-15
 *
 *
 */
public class MaxAndMin {
    public static String solution(String s) {
        String answer = "";
        String[] spStr = s.split(" ");
        String min = "";
        String max = "";

        for(String item : spStr) {
            if(min == "") {
                min = item;
            } else {
                min = (Integer.valueOf(item) <= Integer.valueOf(min)) ? item : min;
            }

            if(max == "") {
                max = item;
            } else {
                max = (Integer.valueOf(item) >= Integer.valueOf(max)) ? item : max;
            }
        }

        return answer += min + " " + max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.println(solution(s));
    }
}
