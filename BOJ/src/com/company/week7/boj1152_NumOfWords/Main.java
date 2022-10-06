package com.company.week7.boj1152_NumOfWords;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * BOJ 1152 단어의 개수
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.split(" ");

        System.out.println(Arrays.stream(words)
                .filter(Predicate.not(w -> w.equals(""))).count());
    }
}
