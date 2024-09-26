package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열의 원소만큼 추가하기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-08-22
 * Solved : 2024-08-22
 *
 *
 */
public class AddAsManyAsElements {
    public static int[] solution(int[] arr) {
        List<Integer> ansList = new ArrayList<>();

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i]; ++j) {
                ansList.add(arr[i]);
            }
        }

        return ansList.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray())));
    }
}
