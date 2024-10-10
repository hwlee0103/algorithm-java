package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 글자 지우기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-15
 * Solved : 2024-07-15
 *
 *
 */
public class ErasingChar {
    public static String solution(String my_string, int[] indices) {
        String answer = "";

        char[] temp = my_string.toCharArray();
        for(int i = 0; i < indices.length; ++i) {
            temp[indices[i]] = '0';
        }
        for(int i = 0; i < temp.length; ++i) {
            if(temp[i] != '0') {
                answer += temp[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] indices = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            indices[i] = Integer.valueOf(spStr[i]);
        }

        System.out.println(solution(my_string, indices));
    }
}
