package com.company.week3.boj2739_Multiplication_Table;

import java.util.Scanner;

/**
 * BOJ 2739 구구단
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for(int i = 1; i <= 9; ++i) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }

    }

}
