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
        Colors answer = dividePaper(paper, 0, 0, N);

        System.out.println(answer.whiteCnt);
        System.out.println(answer.blueCnt);
    }

    public static class Colors {
        int whiteCnt = 0;
        int blueCnt = 0;
    }

    public static class ColorCheck {
        boolean isSameColor = true;
        int color = 0;
    }

    // 색종이 분할
    public static Colors dividePaper(int[][] paper, int startX, int startY, int size) {
        Colors ans = new Colors();
        ColorCheck check = colorChecker(paper, startX, startY, size);

        int[] nextX = {0, 0, size/2, size/2};
        int[] nextY = {0, size/2, 0, size/2};

        if(check.isSameColor) {
            if(check.color == 0) {
                ans.whiteCnt++;
            } else {
                ans.blueCnt++;
            }
        } else {
            for(int i = 0; i < 4; i++) {
                Colors now = dividePaper(paper, nextX[i], nextY[i], size/2);
                ans.whiteCnt += now.whiteCnt;
                ans.blueCnt += now.blueCnt;
            }
        }

        return ans;
    }

    // 색종이 색 검사
    public static ColorCheck colorChecker(int[][] paper, int startX, int startY, int size) {
        ColorCheck ans = new ColorCheck();
        int nowColor = paper[startX][startY];
        if(paper.length == 1) {
            ans.isSameColor = true;
            ans.color = nowColor;
        }
        else {
            for(int i = startX; i < startX + size; i++) {
                for(int j = startY; j < startY + size; j++) {
                    if(nowColor != paper[i][j]) {
                        ans.isSameColor = false;
                        break;
                    }
                }
                if(!ans.isSameColor) {
                    break;
                }
            }

            if(ans.isSameColor) {
                ans.color = nowColor;
            }
        }
        
        return ans;
    }
}
