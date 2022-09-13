package com.company.week6.boj15596_N_sum;

/**
 * BOJ 15596 정수 N개의 합
 */
public class Test {
    long sum(int[] a) {
        long ans = 0;
        for(int x : a) {
            ans += x;
        }
        return ans;
    }
}