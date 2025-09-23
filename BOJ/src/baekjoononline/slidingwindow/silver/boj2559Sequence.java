package baekjoononline.slidingwindow.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Level : Silver 3
 * Title : 2559 수열
 * 문제 유형 : 슬라이딩 윈도우 Sliding Window
 *
 * Started : 2025-09-23
 * Solved : 2025-09-23
 *
 *
 */

public class boj2559Sequence {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int nowSum = 0;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i < K) {
                nowSum += arr[i];
            }
        }

        int maxSum = nowSum;
        for(int i = K; i < N; i++){
            nowSum += arr[i];
            nowSum -= arr[i - K];
            maxSum = Math.max(maxSum, nowSum);
        }

        System.out.println(maxSum);
    }
}
