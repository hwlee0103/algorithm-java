package com.company.week7.boj5622_BAKA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * BOJ 5622 BAKA - 다이얼
 */
public class Main {
    public static void main(String[] args) {
        String[] dial = {"", "", "ABC", "DEF", "GHI", "JKL"
                , "MNO", "PQRS", "TUV", "WXYZ"};
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < dial.length; ++i) {
            for(int j = 0; j < dial[i].length(); ++j) {
                map.put(dial[i].charAt(j), i);
            }
        }

        Scanner input = new Scanner(System.in);
        String str = input.next();

        int cnt = 0;
        for(int i = 0; i < str.length(); ++i) {
            cnt += map.get(str.charAt(i)) + 1;
        }
        System.out.println(cnt);
    }
}
