package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 모음 사전
 * 문제 유형 : 완전탐색
 *
 * Started : 2024-10-07
 * Solved : 2024-10-
 *
 *
 */
public class VowelDictionary {
    static int count = 0;

    public static int solution(String word) {
        boolean[] check = new boolean[26];
        func("", word, check);
        return count;
    }

    public static boolean func(String nowWord, String targetWord, boolean[] check) {
        boolean flag = false;
        String[] vowels = {"A", "E", "I", "O", "U"};

        if(nowWord.equals(targetWord)) {
            return true;
        }
        if(nowWord.length() >= 5) {
            return false;
        }

        for(int i = 0; i < 5; i++) {
            if(!check[i]) {
                VowelDictionary.count += 1;
                flag = func(nowWord + vowels[i], targetWord, check);
            }
            if(flag) {
                return flag;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
