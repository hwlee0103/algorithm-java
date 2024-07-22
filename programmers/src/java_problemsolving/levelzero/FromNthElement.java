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
 * 문제
 * 정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 2 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ num_list의 길이
 *
 * 입출력 예
 * num_list	        n	result
 * [2, 1, 6]	    3	[6]
 * [5, 2, 1, 7, 5]	2	[2, 1, 7, 5]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * [2, 1, 6]의 세 번째 원소부터 마지막 원소까지의 모든 원소는 [6]입니다.
 * 입출력 예 #2
 * [5, 2, 1, 7, 5]의 두 번째 원소부터 마지막 원소까지의 모든 원소는 [2, 1, 7, 5]입니다.
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
