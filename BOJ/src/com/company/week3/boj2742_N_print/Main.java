package com.company.week3.boj2742_N_print;

import java.util.Scanner;

/**
 * BOJ 2742 기찍 N
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = n ; i > 0; --i) {
            System.out.println(i);
        }
    }
}
