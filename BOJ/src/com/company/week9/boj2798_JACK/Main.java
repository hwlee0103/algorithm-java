package com.company.week9.boj2798_JACK;

import java.util.Scanner;

/**
 * BOJ 2798 블랙잭
 */
public class Main {

    public int getJack(int cnt, int idx, int n, int m, int sum) {
        int ans = 0;

        if(cnt == 3) return sum;
        if(idx >= n) return 0;
        if(sum > m) return 0;

        return ans;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] cards = new int[n];

        for(int i = 0 ;i < n; ++i) {
            cards[i] = input.nextInt();
        }

        //재귀 함수
        //depth 3까지
        //3개의 합 m 넘지 않는 최대 수 일 경우 ans 업데이트
        int answer = 0;

        for(int i = 0; i < n ; ++i) {

        }


    }
}
