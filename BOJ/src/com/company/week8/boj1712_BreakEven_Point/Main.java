package com.company.week8.boj1712_BreakEven_Point;

import java.util.Scanner;

/**
 * BOJ 1712 손익분기점
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long a = input.nextLong();
        Long b = input.nextLong();
        Long c = input.nextLong();

        Long x = c - b;
        if(x <= 0) System.out.println("-1");
        else {
            x = ((Long)(a / x) + 1);
            System.out.println(x);
        }
    }
}
