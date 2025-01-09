package baekjoononline.binarysearch.blue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Blue 4
 * Title : 10816 숫자 카드 2
 * 문제 유형 : 이분 탐색 Binary Search
 *
 * Started : 2025-01-09
 * Solved : 2025-01-
 *
 *
 */

public class boj10816NumberCard2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] cards = new int[N];
        for(int i=0; i<N; i++) {
            cards[i] = input.nextInt();
        }
        int M = input.nextInt();
        int[] querys = new int[M];
        for(int i=0; i<M; i++) {
            querys[i] = input.nextInt();
        }

        Arrays.sort(cards);

        // upper bound

        // lower bound

        // upper - lower
    }
}
