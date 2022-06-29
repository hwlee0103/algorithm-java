package com.company.week3.boj2439_printStars_2;

import java.util.Scanner;

/**
 * BOJ 2439 별 찍기 - 2
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n; ++j) {
                if(j <= n-i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
