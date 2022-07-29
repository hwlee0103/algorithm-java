package com.company.week4_remain.boj11021_AplusB_7;

import java.util.Scanner;

/**
 * BOJ 11021 A + B - 7
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + (a+b) );
        }

    }
}
