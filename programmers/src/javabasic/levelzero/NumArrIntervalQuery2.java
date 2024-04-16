package javabasic.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 수열과 구간 쿼리 2
 * 문제 유형 : 반복문
 *
 * Started : 2024-04-16
 * Solved : 2024-04-16
 *
 *
 */
public class NumArrIntervalQuery2 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int idx = 0; idx < queries.length ; ++idx) {
            int num = 1000001;
            for(int i = queries[idx][0] ; i <= queries[idx][1]; ++i) {
                if(arr[i] > queries[idx][2]) {
                    num = Math.min(num, arr[i]);
                }
            }
            if(num == 100001) num = -1;
            answer[idx] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arrStr = input.next();
        String[] arrSp = arrStr.split(", ");
        int[] arr = new int[arrSp.length];
        for(int i = 0 ; i < arrSp.length; ++i) {
            arr[i] = Integer.valueOf(arrSp[i]);
        }

        int n = input.nextInt();
        for(int i = 0;i < n; ++i ) {
            String querStr = input.next();
            String[] querSp = querStr.split(", ");

        }
//        for(int i = 0; i < n ;++i) {
//            for(int j = 0; j < querSp.length; ++j) {
//                int[][] queries = new int[n][querSp.length];
//                queries[i][j] =
//            }
//        }
//
//        System.out.println(solution());
    }

}
