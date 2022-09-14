package com.company.week5.boj1546_Average;

import java.util.Scanner;

/**
 * BOJ 1546 평균
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double average = 0.0;
        int[] score = new int[n];
        int maxN = 0;

        for(int i = 0; i < n ; ++i) {
            score[i] = input.nextInt();
            if(score[i] > maxN) maxN = score[i];
        }
        for (int i = 0; i < n ;++i) {
            average += ((double)score[i]/maxN) * 100;
        }
        System.out.println(average/n);
    }
}
