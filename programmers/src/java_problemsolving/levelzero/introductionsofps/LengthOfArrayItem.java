package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 원소의 길이
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-08
 * Solved : 2024-05-08
 *
 *
 */
public class LengthOfArrayItem {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int idx = 0;
        for(String str : strlist) {
            answer[idx++] = str.length();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        inputStr = inputStr.replace("\"", "");
        String[] strlist = inputStr.split(", ");

        int[] answer = solution(strlist);
        System.out.print("[");
        for(int i = 0;i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

}
