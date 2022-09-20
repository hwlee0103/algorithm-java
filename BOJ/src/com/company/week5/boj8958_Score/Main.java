package com.company.week5.boj8958_Score;

import java.util.Scanner;

/**
 * BOJ 8958 Score
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i = 0; i < t ; ++i) {
            String test = "";
            test = input.next();
            int[] score = new int[test.length()];
            int sum = 0;
            for(int j = 0; j < test.length(); ++j) {
                if(j == 0 && test.charAt(j) == 'O') {
                    score[j] = 1;
                } else if(test.charAt(j) == 'O') {
                    score[j] = score[j-1] + 1;
                } else {
                    score[j] = 0;
                }

                sum += score[j];
            }
            System.out.println(sum);
        }
    }
}
