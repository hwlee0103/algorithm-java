package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : n 번째 원소까지
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-26
 * Solved : 2024-07-26
 *
 *
 */
public class ToNthElement {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i = 0; i < n; ++i) {
            answer[i] = num_list[i];
        }

        // 다른 방법
//        int[] answer = Arrays.copyOfRange(num_list, 0, n);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num_list = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        int n = input.nextInt();
        int[] answer = solution(num_list, n);
        System.out.println(Arrays.toString(answer));
    }
}
