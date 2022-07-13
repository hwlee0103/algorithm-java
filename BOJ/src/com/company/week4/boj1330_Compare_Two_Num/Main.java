package com.company.week4.boj1330_Compare_Two_Num;

import java.util.Scanner;

/**
 * BOJ 1330 두 수 비교하기
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
