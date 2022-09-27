package com.company.week1to4_remain.boj10951_AplusB_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * BOJ 10951 A + B - 4
 */
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       while(input.hasNextInt()) {
           int a = input.nextInt();
           int b = input.nextInt();

           System.out.println(a+b);
       }
    }
}
