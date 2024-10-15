package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자 개수 세기
 * 문제 유형 : 코딩 기초 트레이닝 - 리스트(배열)
 *
 * Started : 2024-07-14
 * Solved : 2024-07-14
 *
 *
 */
public class CountingChars {
    public static int[] solution(String my_string) {
        int[] answer = new int[52];

        for(Character now : my_string.toCharArray()) {
            if(Character.isUpperCase(now)) {
                answer[now - (int)'A']++;
            } else {
                answer[now - (int)'a' + 26]++;
            }
        }

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
