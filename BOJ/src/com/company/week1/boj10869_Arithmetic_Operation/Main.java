package com.company.week1.boj10869_Arithmetic_Operation;

import java.util.Scanner;

/**
 * BOJ 10869 사칙연산
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
