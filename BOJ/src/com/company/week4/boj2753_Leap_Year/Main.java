package com.company.week4.boj2753_Leap_Year;

import java.util.Scanner;

/**
 * BOJ 2753 윤년
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if((year %4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
