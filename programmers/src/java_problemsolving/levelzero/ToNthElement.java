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
 * 문제
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 2 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ num_list의 길이 ___
 *
 * 입출력 예
 * num_list	        n	result
 * [2, 1, 6]	    1	[2]
 * [5, 2, 1, 7, 5]	3	[5, 2, 1]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * [2, 1, 6]의 첫 번째 원소부터 첫 번째 원소까지의 모든 원소는 [2]입니다.
 * 입출력 예 #2
 * [5, 2, 1, 7, 5]의 첫 번째 원소부터 세 번째 원소까지의 모든 원소는 [5, 2, 1]입니다.
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