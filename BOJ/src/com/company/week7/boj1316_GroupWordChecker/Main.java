package com.company.week7.boj1316_GroupWordChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * BOJ 1316 그룹 단어 체커
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt = 0;
        for(int i = 0; i < n ; ++i) {
            String word = input.next();
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            Boolean isGroup = false;
            Character prev = ' ';

            for(int k = 0; k < 26; ++k) {
                map.put((char)('a' + k), 0);
            }

            for(int j = 0; j < word.length(); ++j) {
                Character now = word.charAt(j);
                if(now.equals(prev) == false) {
                    if(map.get(now) == 0) {
                       map.put(now, 1);
                       prev = now;
                    }
                    else {
                        isGroup = true;
                        break;
                    }
                }
            }
            if(isGroup == false) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
