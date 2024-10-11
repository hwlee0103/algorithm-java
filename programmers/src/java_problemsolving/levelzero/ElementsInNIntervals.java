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
