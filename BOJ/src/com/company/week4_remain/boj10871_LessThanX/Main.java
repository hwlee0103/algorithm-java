package com.company.week4_remain.boj10871_LessThanX;

import java.util.Scanner;

/**
 * BOJ 10871 X보다 작은 수
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int x = input.nextInt();

        for(int i = 0; i < n ; ++i) {
            int a = input.nextInt();
            if(a < x) System.out.print(a + " ");
        }
        System.out.println();
    }
}
