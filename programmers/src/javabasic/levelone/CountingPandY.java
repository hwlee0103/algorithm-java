package javabasic.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 문자열 내 p와 y의 개수
 * 문제 유형 : 연습문제
 *
 * Started : 2024-04-09
 * Solved : 2024-04-09
 *
 *
 */
public class CountingPandY {
    public static boolean solution(String s) {
        int pnum = 0;
        int ynum = 0;

        for(Character c : s.toCharArray()) {
            if(c == 'p' || c == 'P') pnum++;
            if(c == 'y' || c == 'Y') ynum++;
        }

        return (pnum == ynum) ? true : false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(solution(str));
    }

}
