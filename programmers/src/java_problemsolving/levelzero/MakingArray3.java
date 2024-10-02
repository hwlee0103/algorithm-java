package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 만들기 3
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-18
 * Solved : 2024-07-18
 *
 *
 */
public class MakingArray3 {
    public static int[] solution(int[] arr, int[][] intervals) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < intervals.length; ++i) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; ++j) {
                ans.add(arr[j]);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] arr = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            arr[i] = Integer.valueOf(spStr[i]);
        }
        str = input.nextLine();
        spStr = str.split("], \\[");
        int[][] intervals = new int[2][2];
        for(int i = 0; i < spStr.length; ++i) {
            spStr[i] = spStr[i].replaceAll("\\[", "");
            spStr[i] = spStr[i].replaceAll("]", "");
            String[] spItem = spStr[i].split(", ");
            intervals[i][0] = Integer.valueOf(spItem[0]);
            intervals[i][1] = Integer.valueOf(spItem[1]);
        }

        int[] answer = solution(arr, intervals);
        System.out.print("[");
        for(int i = 0 ; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
