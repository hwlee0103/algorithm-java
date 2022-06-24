package com.company.week3.boj8393_Sum;

import java.util.Scanner;

/**
 * BOJ 8393 Sum
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;

        for(int i = 1; i <= n; ++i){
            sum += i;
        }

        System.out.println(sum);
    }
}
