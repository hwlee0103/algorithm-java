package baekjoononline.divideandconquer.gold;

import java.util.Scanner;

/**
 * Level : Gold 5
 * Title : Z
 * 문제 유형 : 분할 정복 Divide And Conquer
 *
 * Started : 2025-04-25
 * Solved : 2025-04-28
 *
 *
 */
public class boj1074Z {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int c = input.nextInt();
        FindCheck ans = new FindCheck();
        System.out.println(zDivide(0, 0, r, c, (int) Math.pow(2, n), ans).count);
    }

    public static class FindCheck {
        boolean flag = false;
        int count;
    }

    public static FindCheck zDivide(int nowR, int nowC, int r, int c, int size, FindCheck ans) {
        int[] dr = {0, 0, size/2, size/2};
        int[] dc = {0, size/2, 0, size/2};

        if(nowR == r && nowC == c) {
            ans.flag = true;
            return ans;
        }
        if(size == 1) {
            ans.count++;
            return ans;
        }

        for(int i = 0; i < 4; ++i) {
            if(ans.flag) break;
            // 범위에 해당하지 않으면 탐색하지 않고 개수만 증가시키
            int nextR = nowR + dr[i];
            int nextC = nowC + dc[i];
            if(nextR + size/2 >= r && nextC + size/2 >= c && nextR <= r && nextC <= c) {
                ans = zDivide(nextR, nextC, r, c, size/2, ans);
            } else {
                ans.count += (size/2) * (size/2);
            }
        }
        return ans;
    }
}
