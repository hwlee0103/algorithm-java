package com.company.week7.boj1157_WordStudy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * BOJ 1157 단어 공부
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, 0);
        word = word.toUpperCase();

        int max = 0;
        Boolean flag = false;
        int idx = 0;
        for(int i = 0; i < word.length(); ++i) {
            alphabet[word.charAt(i) - 'A']++;
            if(alphabet[word.charAt(i) - 'A'] > max) {
                max = alphabet[word.charAt(i) - 'A'];
                flag = false;
                idx = word.charAt(i) - 'A';
            }
            else if(alphabet[word.charAt(i) - 'A'] == max){
                flag = true;
            }
        }

        if(flag == true) System.out.println("?");
        else {
            System.out.println((char)(idx + 'A'));
        }
    }
}
