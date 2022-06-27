package com.company.week3.boj2741_print_N;

import java.util.Scanner;

/**
 * BOJ 2741 N 찍기
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i = 1; i<= n; ++i) {
            System.out.println(i);
        }
    }
}
