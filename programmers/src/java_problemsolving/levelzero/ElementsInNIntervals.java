package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : n개 간격의 원소들
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-27
 * Solved : 2024-07-27
 *
 * 문제
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는
 * 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 5 ≤ num_list의 길이 ≤ 20
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ 4
 *
 * 입출력 예
 * num_list	            n	result
 * [4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
 * [4, 2, 6, 1, 7, 6]	4	[4, 7]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * [4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.
 * 입출력 예 #2
 * [4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.
 *
 */
public class ElementsInNIntervals {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> ansList = new ArrayList<>();
        for(int i = 0; i < num_list.length; i += n) {
            ansList.add(num_list[i]);
        }
        answer = new int[ansList.size()];
        for(int i = 0; i < ansList.size(); ++i) {
            answer[i] = ansList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]  num_list = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        int n = input.nextInt();
        int[] answer = solution(num_list, n);
        System.out.println(Arrays.toString(answer));
    }
}
