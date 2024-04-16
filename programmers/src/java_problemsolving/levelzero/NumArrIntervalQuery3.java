package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 수열과 구간 쿼리 3
 * 문제 유형 : 반복문
 *
 * Started : 2024-04-15
 * Solved : 2024-04-15
 *
 *
 */
public class NumArrIntervalQuery3 {
    public static int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length ; ++i) {
            int x = arr[queries[i][0]];
            int y = arr[queries[i][1]];
            arr[queries[i][0]] = y;
            arr[queries[i][1]] = x;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            int x = input.nextInt();
            arr[i] = x;
        }

        int m = input.nextInt();
        int[][] queries = new int[m][m];
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < m; ++j) {
                int x = input.nextInt();
                int y = input.nextInt();
//                queries[i][j] = ;
            }

        }
    }
}
