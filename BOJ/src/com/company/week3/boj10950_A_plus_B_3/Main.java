package com.company.week3.boj10950_A_plus_B_3;

import java.util.Scanner;

/**
 * BOJ 10950 A + B - 3
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i = 0; i < t; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println(a + b);
        }
    }
}
