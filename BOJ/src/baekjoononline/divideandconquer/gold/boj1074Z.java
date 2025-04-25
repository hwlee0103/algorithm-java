package baekjoononline.divideandconquer.gold;

import java.util.Scanner;

/**
 * Level : Gold 5
 * Title : Z
 * 문제 유형 : 분할 정복 Divide And Conquer
 *
 * Started : 2025-04-25
 * Solved : 2025-
 *
 *
 */
public class boj1074Z {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int c = input.nextInt();

        System.out.println(zDivide(0, 0, r, c, (int) Math.pow(2, n), 0));
    }

    // todo Z 분할정복
    public static int zDivide(int nowR, int nowC, int r, int c, int size, int cnt) {
        int[] dr = {0, 0, size/2, size/2};
        int[] dc = {0, size/2, 0, size/2};

        if(nowR == r && nowC == c) {
            return ++cnt;
        }
        if(size == 1) {
            return ++cnt;
        }

        for(int i = 0; i < 4; ++i) {
            // todo: 확인
            cnt += zDivide(nowR + dr[i], nowC + dc[i], r, c, size/2, cnt);
        }
        return cnt;
    }

}
