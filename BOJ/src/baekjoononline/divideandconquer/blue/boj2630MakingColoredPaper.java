package baekjoononline.divideandconquer.blue;

import java.util.Scanner;

/**
 * Level : Blue 2
 * Title : 색종이 만들기
 * 문제 유형 : 분할 정복 Divide And Conquer
 *
 * Started : 2025-04-21
 * Solved : 2025-
 *
 *
 */
public class boj2630MakingColoredPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] paper = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                paper[i][j] = input.nextInt();
            }
        }



    }

    // 색종이 색 검사
    public static boolean colorChecker(int[][] paper) {
        boolean isSameColor = true;

        
        return isSameColor;
    }
}
