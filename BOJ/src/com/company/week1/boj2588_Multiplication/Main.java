package com.company.week1.boj2588_Multiplication;

import java.util.Scanner;

/**
 * BOJ 2588 곱셈
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = a * (b%10);
        int d = a * ((b%100)/10);
        int e = a * (b/100);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println(c + (d * 10) + (e * 100));
    }
}
