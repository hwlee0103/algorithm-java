package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 수열과 구간 쿼리 4
 * 문제 유형 : 반복문
 *
 * Started : 2024-04-17
 * Solved : 2024-04-17
 *
 *
 */
public class NumArrIntervalQuery4 {
    public static int[] solution(int[] arr, int[][] queries) {
        for(int idx = 0; idx < queries.length ; ++idx) {
            int s = queries[idx][0];
            int e = queries[idx][1];
            int k = queries[idx][2];

            for(int i = s; i <= e; ++i) {
                if(i%k==0) ++arr[i];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arrStr = input.nextLine();
        String[] arrSp = arrStr.split(", ");
        int[] arr = new int[arrSp.length];
        for(int i = 0 ; i < arrSp.length; ++i) {
            arr[i] = Integer.valueOf(arrSp[i]);
        }

        int n = input.nextInt();
        int m = input.nextInt();
        int[][] queries = new int[n][m];

        Scanner newInput = new Scanner(System.in);
        for(int i = 0;i < n; ++i ) {
            String querStr = newInput.nextLine();
            String[] querSp = querStr.split(", ");
            for(int j = 0; j < querSp.length; ++j) {
                queries[i][j] = Integer.valueOf(querSp[j]);
            }
        }
        int[] ans = solution(arr, queries);
        String finalans = "[";
        for(int i = 0; i < ans.length; ++i) {
            finalans += String.valueOf(ans[i]);
            if(i != ans.length - 1) finalans += ", ";
        }
        finalans += "]";
        System.out.println(finalans);
    }
}
