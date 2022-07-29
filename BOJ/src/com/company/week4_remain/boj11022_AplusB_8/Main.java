package com.company.week4_remain.boj11022_AplusB_8;

import java.util.Scanner;

/**
 * BOJ 11022 A + B - 8
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i = 1 ; i <= t; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();

            String str = "Case #" + Integer.toString(i) + ": " + Integer.toString(a) + " + " + Integer.toString(b) + " = " + Integer.toString(a + b);
            System.out.println(str);
        }
    }
}
