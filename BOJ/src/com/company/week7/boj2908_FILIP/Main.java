package com.company.week7.boj2908_FILIP;

import java.util.Scanner;

/**
 * BOJ 2908 FILIP 상수
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int aflip = 0;
        int bflip = 0;
        while(a>0 && b>0) {
            aflip *= 10;
            aflip += a%10;
            a /= 10;

            bflip *= 10;
            bflip += b%10;
            b /= 10;
        }

        int ans = (aflip > bflip) ? aflip : bflip;
        System.out.println(ans);
    }
}
