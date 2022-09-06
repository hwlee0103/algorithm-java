package com.company.week5.boj2562_maxNum;

import java.util.Scanner;

/**
 * BOJ 2562 최댓값
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = 1;
        int max = 0;
        for(int i = 1; i <= 9; ++i) {
            int x = input.nextInt();
            if(x > max) {
                max = x;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
