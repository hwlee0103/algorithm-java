package com.company.week7.boj11654_Ascii;

import java.util.Scanner;

/**
 * BOJ 11654 아스키코드
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println((int)str.charAt(0));
    }
}
