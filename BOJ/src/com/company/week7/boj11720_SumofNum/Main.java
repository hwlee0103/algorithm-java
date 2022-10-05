package com.company.week7.boj11720_SumofNum;

import java.util.Scanner;

/**
 * BOJ 11720 숫자의 합
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();
        int sum = 0;

        for(int i = 0; i < str.length(); ++i) {
            sum += Character.getNumericValue(str.charAt(i));
        }

        System.out.println(sum);
    }
}
