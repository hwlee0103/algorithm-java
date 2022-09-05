package com.company.week5.boj10818_Min_Max;

import java.util.Scanner;

/**
 * BOJ 10818 최소, 최대
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int min = 1000000;
        int max = -1000000;
        for(int i = 0; i < n ;++i) {
            int x = input.nextInt();
            if(x < min) min = x;
            if(x > max) max = x;
        }
        System.out.println(min + " " + max);
    }
}
