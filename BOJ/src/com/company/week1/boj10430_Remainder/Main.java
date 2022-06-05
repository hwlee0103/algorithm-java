package com.company.week1.boj10430_Remainder;

import java.util.Scanner;

/**
 * BOJ 10430 나머지
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
