package com.company.week1to4_remain.boj10952_AplusB_5;

import java.util.Scanner;

/**
 * BOJ 10952 A+B - 5
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            int a = input.nextInt();
            int b = input.nextInt();

            if(a == 0 && b == 0) break;

            System.out.println(a + b);
        }
    }
}
