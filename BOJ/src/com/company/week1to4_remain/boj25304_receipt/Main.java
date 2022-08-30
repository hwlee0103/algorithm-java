package com.company.week1to4_remain.boj25304_receipt;

import java.util.Scanner;

/**
 * BOJ 25304 영수증
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Long X = input.nextLong();
        int n = input.nextInt();

        for(int i = 0; i < n; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();

            X -= (a * b);
        }

        if(X == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
