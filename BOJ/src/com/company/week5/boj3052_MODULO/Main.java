package com.company.week5.boj3052_MODULO;

import java.util.HashMap;
import java.util.Scanner;

/**
 * BOJ 3052 MODULO
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < 10; ++i) {
            int x = input.nextInt();

            if(map.get(x % 42) == null) {
                map.put(x % 42, 1);
            }
        }
        System.out.println(map.size());
    }
}
