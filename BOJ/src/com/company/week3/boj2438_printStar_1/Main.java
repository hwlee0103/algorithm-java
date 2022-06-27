package com.company.week3.boj2438_printStar_1;

import java.util.Scanner;

/**
 * BOJ 2438 별 찍기 - 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n ;++i) {
            for(int j = 1; j <= i ; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
