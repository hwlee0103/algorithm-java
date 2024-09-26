package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 순서 바꾸기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-24
 * Solved : 2024-07-24
 *
 *
 */
public class ChangeOrder {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for(int i = n; i < num_list.length; ++i) {
            answer[i - n] = num_list[i];
        }
        for(int i = 0; i < n; ++i) {
            answer[num_list.length - n + i] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] str_arr = str.split(", ");
        int[] num_list = new int[str_arr.length];
        for(int i = 0; i < str_arr.length; ++i) {
            num_list[i] = Integer.parseInt(str_arr[i]);
        }
        int n = input.nextInt();
        int[] answer = solution(num_list, n);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if (i < answer.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
