package baekjoononline.divideandconquer.silver;

import java.util.Scanner;

/**
 * Level : Silver 2
 * Title : 종이의 개수
 * 문제 유형 : 분할 정복 Divide And Conquer
 *
 * Started : 2025-04-30
 * Solved : 2025-04-30
 *
 *
 */

public class boj1780NumberOfPapers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] papers = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                papers[i][j] = sc.nextInt();
            }
        }

        // answer[0] = -1, answer[1] = 0, answer[2] = 1 종이의 개수
        int[] answer = new int[3];
        answer = dividePapers(papers, 0, 0, n);

        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int[] dividePapers(int[][] papers, int startX, int startY, int size) {
        // 종료조건
        boolean result = checkPapers(papers, startX, startY, size);
        int[] answer = new int[3];

        if(result) {
            answer[papers[startX][startY] + 1]++;
            return answer;
        }
        // 1/3
        int[] dx = {0, 0, 0, size/3, size/3, size/3, 2*(size/3), 2*(size/3), 2*(size/3)};
        int[] dy = {0, size/3, 2*(size/3), 0, size/3, 2*(size/3), 0, size/3, 2*(size/3)};

        for(int i = 0; i < 9; ++i) {
            int[] tmp = dividePapers(papers, startX + dx[i], startY + dy[i], size/3);

            for(int k = 0; k < 3; ++k) {
                answer[k] += tmp[k];
            }
        }

        return answer;
    }

    public static boolean checkPapers(int[][] papers, int startX, int startY, int size) {
        boolean flag = true;
        int startNum = papers[startX][startY];
        for (int i = startX; i < startX + size; i++) {
            for (int j = startY; j < startY + size; j++) {
                if (papers[i][j] != startNum) {
                    flag = false;
                    break;
                }
            }
            if (!flag) break;
        }
        return flag;
    }
}
