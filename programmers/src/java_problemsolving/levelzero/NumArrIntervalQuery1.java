package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 수열과 구간 쿼리 1
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-08-01
 * Solved : 2024-08-01
 *
 *
 */
public class NumArrIntervalQuery1 {
    public static int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; ++i) {
            for(int j = queries[i][0] ; j <= queries[i][1]; ++j) {
                arr[j]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        String str = input.nextLine();
        String[] spStr = str.split("],\\[");
        int[][] queries = new int[spStr.length][2];
        for(int i = 0; i < spStr.length; ++i) {
            String now = spStr[i].replaceAll("\\[", "");
            now = now.replaceAll("]", "");
            queries[i] = Arrays.stream(now.split(", ")).mapToInt(Integer::valueOf).toArray();
        }

        int[] result = solution(arr, queries);
        System.out.println(Arrays.toString(result));
    }
}
