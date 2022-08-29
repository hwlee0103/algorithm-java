package com.company.week1to4_remain.boj2525_oven_clock;

import java.util.Scanner;

/**
 * BOJ 2525 오븐 시계
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int hour = C / 60;
        int min = C % 60;
        hour += (B + min) / 60;
        B = (B + min) % 60;
        A = (A + hour) % 24;

        System.out.print(A + " " + B + "\n");

    }
}
