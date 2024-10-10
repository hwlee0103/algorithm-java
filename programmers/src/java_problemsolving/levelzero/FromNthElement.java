package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : n 번째 원소부터
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-22
 * Solved : 2024-07-22
 *
 *
 */
public class FromNthElement {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        for(int i = n - 1; i < num_list.length; ++i) {
            answer[i - (n - 1)] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] num_list = new int[spStr.length];
        for(int i = 0;i < spStr.length; ++i) {
            num_list[i] = Integer.valueOf(spStr[i]);
        }
        int n = input.nextInt();
        int[] answer = solution(num_list, n);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
