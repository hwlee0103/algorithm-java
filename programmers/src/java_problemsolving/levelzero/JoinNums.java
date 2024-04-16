package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 이어 붙인 수
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-09
 * Solved : 2024-04-09
 *
 *
 */
public class JoinNums {
    public static int solution(int[] num_list) {
        int answer = 0;
        String odds = "";
        String evens = "";
        for(int val : num_list) {
            if(val%2==0) evens += String.valueOf(val);
            else odds += String.valueOf(val);
        }

        return answer = Integer.valueOf(odds) + Integer.valueOf(evens);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replace("[", "");
        str = str.replace("]", "");
        String[] spStr = str.split(", ");
        int[] num_list = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            num_list[i] = Integer.valueOf(spStr[i]);
        }

        System.out.println(solution(num_list));
    }
}
