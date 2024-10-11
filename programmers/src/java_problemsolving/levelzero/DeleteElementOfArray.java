package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열의 원소 삭제하기
 * 문제 유형 : 조건문 활용
 *
 * Started : 2024-09-05
 * Solved : 2024-09-05
 *
 *
 */
public class DeleteElementOfArray {
    public static int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        for(int i = 0; i < delete_list.length; ++i) {
            for(int j = 0; j < arr.length; ++j) {
                if(arr[j] == delete_list[i]) {
                    arr[j] = 0;
                }
            }
        }
        List<Integer> ansList = new ArrayList<>();
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] != 0) {
                ansList.add(arr[i]);
            }
        }

        answer = new int[ansList.size()];
        for(int i = 0; i < ansList.size(); ++i) {
            answer[i] = ansList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] delete_list = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(Arrays.toString(solution(arr, delete_list)));
    }
}
