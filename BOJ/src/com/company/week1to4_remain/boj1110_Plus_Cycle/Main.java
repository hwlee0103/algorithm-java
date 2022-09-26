package com.company.week1to4_remain.boj1110_Plus_Cycle;

import java.util.Scanner;

/**
 * BOJ 1110 더하기 사이클
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = n;
        int cnt = 0;
        do {
            int tmp = 0;
            if(x < 10) tmp = x;
            else {
                tmp = x/10 + x%10;
            }

            x = (x%10)*10 + tmp%10;
            cnt++;
        } while(x != n);
        System.out.println(cnt);
    }
}
