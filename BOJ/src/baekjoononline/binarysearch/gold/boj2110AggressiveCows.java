package baekjoononline.binarysearch.gold;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Gold 4
 * Title : 2110 공유기 설치 Aggressive Cow
 * 문제 유형 : 이분 탐색 Binary Search / 파라메트릭 서치 Parametric Search
 *
 * Started : 2025-07-23
 * Solved : 2025-0
 *
 *
 */
public class boj2110AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // 가능한 거리 범위
        int left = 1;
        int right = arr[N - 1] - arr[0];

        // 그럼 현재 거리를 기준으로, arr에 몇 개의 공유기를 설치할 수 있느냐가 관건
        // 만약 설치 갯수가 부족하다면 현재 거리를 줄이고
        // 설치 갯수가 남는다면 현재 거리를 늘려야 -> 최대 거리
        while(left <= right) {
            int mid = (left + right) / 2;
            // todo: arr에서 설치 갯수 탐색
            // todo: 이중 for문으로 시작점 변경해가면서 탐색하지 않아도 될지?
            int cnt = 0;
            if(cnt < C) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

    }

    // dist: 인접한 공유기 사이의 거리 !
    public static int checkArr(int[] arr, int dist) {
        int res = 0;

        for(int i=0; i<arr.length; i++) {

        }

        return res;
    }
}
