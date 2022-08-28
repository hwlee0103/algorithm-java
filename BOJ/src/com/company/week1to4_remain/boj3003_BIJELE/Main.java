package com.company.week1to4_remain.boj3003_BIJELE;

import java.util.Scanner;

/**
 * BOJ 3003 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class Main {
    public static void main(String[] args) {
        int[] chess = {1, 1, 2, 2, 2, 8};

        Scanner input = new Scanner(System.in);
        int[] dongHyuk = new int[6];
        int[] answer = new int[6];

        for(int i = 0; i < dongHyuk.length; ++i) {
            dongHyuk[i] = input.nextInt();
            answer[i] = chess[i] - dongHyuk[i];
            System.out.print(answer[i] + " ");
        }
        System.out.println();

    }
}
