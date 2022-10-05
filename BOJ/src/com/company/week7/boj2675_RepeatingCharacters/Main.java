package com.company.week7.boj2675_RepeatingCharacters;

import java.util.Scanner;

/**
 * BOJ 2675 Repeating Characters
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; ++i) {
            int r = input.nextInt();
            String s = input.next();
            String p = "";
            for(int j = 0; j < s.length(); ++j) {
                for(int k = 0; k < r; ++k) {
                    p += s.charAt(j);
                }
            }
            System.out.println(p);
        }
    }
}
