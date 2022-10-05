package com.company.week7.boj10809_FindAlphabet;

import java.util.Arrays;
import java.util.Scanner;

/**
 * BOJ 10809 알파벳 찾기
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for(int i = 0; i < s.length(); ++i) {
            if(alphabet[s.charAt(i) - 'a'] == -1) {
                alphabet[s.charAt(i) - 'a'] = i;
            }
        }

        for(int x : alphabet) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }
}
