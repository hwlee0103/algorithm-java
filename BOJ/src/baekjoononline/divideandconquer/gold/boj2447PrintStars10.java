package baekjoononline.divideandconquer.gold;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Level : Gold 5
 * Title : 별 찍기 - 10
 * 문제 유형 : 분할 정복 Divide And Conquer
 *
 * Started : 2025-04-24
 * Solved : 2025-04-24
 *
 *
 */

public class boj2447PrintStars10 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        char[][] starBoard = new char[N][N];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        makeStars(starBoard, 0, 0, N);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(starBoard[i][j] == '\0') {
                    bw.write(" ");
                }
                else bw.write(starBoard[i][j]);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    public static void makeStars(char[][] starBoard, int startX, int startY, int size) {
        int[] dx = {0, 1, 2};
        int[] dy = {0, 1, 2};

        if(size == 1) {
            starBoard[startX][startY] = '*';
            return;
        }
        for(int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (i == 1 && j == 1) continue;
                makeStars(starBoard, startX + dx[i] * (size / 3), startY + dy[j] * (size / 3), size / 3);
            }
        }
    }
}
