package com.company.week5.boj4344_AboveAverage;

import java.util.Scanner;

/**
 * BOJ 4344 Above Average - 평균은 넘겠지
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();

        for(int i = 0; i < c; ++i) {
            int n = input.nextInt();
            int[] score = new int[n];
            double average = 0;

            for(int j = 0; j < n; ++j) {
                score[j] = input.nextInt();
                average += score[j];
            }
            average = (double) average / n;

            int cnt = 0;
            for(int j = 0; j < n ; ++j) {
                if(score[j] > average) cnt++;
            }
            double result = ((double)cnt / n) * 100;
            System.out.println(String.format("%.3f", result) + "%");
        }

    }

}
