package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 카운트 다운
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-16
 * Solved : 2024-07-16
 *
 *
 */
public class CountDown {
    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        int idx = 0;
        for(int i = start_num ; i >= end_num; --i) {
            answer[idx++] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start_num = input.nextInt();
        int end_num = input.nextInt();
        int[] answer = solution(start_num, end_num);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
