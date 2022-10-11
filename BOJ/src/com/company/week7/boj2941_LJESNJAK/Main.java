package com.company.week7.boj2941_LJESNJAK;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * BOJ 2941 LJESNJAK - 크로아티아 알파벳
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String s : alpha) {
            map.put(s, 1);
        }

        int cnt = 0;
        for(int i = 0; i < str.length(); ++i) {
            if((i < str.length() - 1) && (map.containsKey(str.substring(i, i+2)) == true)) {
               ++i;
            } else if((i < str.length() - 2) && (map.containsKey(str.substring(i, i+3)) == true)) {
                i += 2;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
