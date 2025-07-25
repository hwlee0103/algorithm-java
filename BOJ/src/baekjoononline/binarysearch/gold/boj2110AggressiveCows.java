package baekjoononline.binarysearch.gold;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Gold 4
 * Title : 2110 공유기 설치 Aggressive Cow
 * 문제 유형 : 이분 탐색 Binary Search / 파라메트릭 서치 Parametric Search
 *
 * Started : 2025-07-23
 * Solved : 2025-07-25
 *
 *
 */
public class boj2110AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] house = new int[N];
        for(int i=0; i<N; i++) {
            house[i] = sc.nextInt();
        }

        Arrays.sort(house);

        // 가능한 거리 범위
        long left = 1;
        long right = house[N - 1] - house[0];
        long answer = 0;
        // 그럼 현재 거리를 기준으로, house에 C 개의 공유기를 설치할 수 있느냐가 관건
        // 만약 설치 갯수가 부족하다면 현재 거리를 줄이고 -> C만큼 불가능하다
        // 설치 갯수가 남는다면 현재 거리를 늘려야 -> 최대 거리 -> C보다 많이 설치 가능하다
        while(left <= right) {
            long mid = (left + right) / 2;

            if(checkHouse(house, mid, C)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }

    // dist: 인접한 공유기 사이의 거리
    public static boolean checkHouse(int[] house, long dist, int C) {
        int cnt = 1;
        int lastInstalled = house[0];

        for(int i=0; i< house.length; i++) {
            if(house[i] - lastInstalled >= dist) {
                cnt++;
                lastInstalled = house[i];
            }
        }

        return cnt >= C;
    }
}
