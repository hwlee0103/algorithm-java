package java_problemsolving.levelzero.introductionsofps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 정렬하기(1)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-06
 * Solved : 2024-05-06
 *
 *
 */
public class SortingString1 {
    public static int[] solution(String my_string) {
        int[] answer = {};
        String numstr = "";
        for(Character c : my_string.toCharArray()) {
            int now = c - '0';
            if(0 <= now && now <= 9) {
                numstr += c.toString();
            }
        }
        answer = new int[numstr.length()];
        for(int i = 0; i < numstr.length(); ++i) {
            answer[i] = numstr.charAt(i) - '0';
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();

        int[] answer = solution(my_string);
        System.out.print("[");
        for(int i = 0;i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

}
