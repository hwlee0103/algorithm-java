package com.company.week8.boj2292_BeeHouse;

import java.util.Scanner;

/**
 * BOJ 2292 벌집
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long num = input.nextLong();
        Long x = Long.valueOf(1);
        int idx = 1;

        while(x < num) {
            x += idx * 6;
            idx++;
        }
        System.out.println(idx);
    }
}
