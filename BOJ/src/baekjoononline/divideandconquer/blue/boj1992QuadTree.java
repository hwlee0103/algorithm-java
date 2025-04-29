package baekjoononline.divideandconquer.blue;

import java.util.Scanner;

/**
 * Level : Silver 5
 * Title : 쿼드트리
 * 문제 유형 : 분할 정복 Divide And Conquer
 *
 * Started : 2025-04-29
 * Solved : 2025-04-29
 *
 *
 */

public class boj1992QuadTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] board = new int[N][N];
        for(int i = 0; i<N; i++) {
            String nowIn = input.next();
            for(int j = 0; j<N; j++) {
                board[i][j] = nowIn.charAt(j) - '0';
            }
        }

        String answer = QuadTree(board, 0, 0, N);

        System.out.println(answer);
    }

    public static String QuadTree(int[][] board, int startX, int startY, int size) {
        StringBuilder answer = new StringBuilder();

        // 분할 - 4분할
        // 조건: 모든 칸이 같은 숫자가 아닐 때 분할
        boolean now = checkBoard(board, size, startX, startY);

        if(now) {
            answer.append(String.valueOf(board[startX][startY]));
        } else {
            int[] dx = {0, 0, size/2, size/2};
            int[] dy = {0, size/2, 0, size/2};
            answer.append("(");
            for(int i = 0; i < 4; ++i) {
                answer.append(QuadTree(board, startX + dx[i], startY + dy[i], size / 2));
            }
            answer.append(")");
        }

        return answer.toString();
    }


    public static boolean checkBoard(int[][] board, int size, int startX, int startY) {
        boolean result = true;
        int firstNum = board[startX][startY];
        for(int i = 0;i < size; ++i) {
            for(int j = 0;j < size; ++j) {
                if(board[startX + i][startY + j] != firstNum) {
                    result = false;
                    break;
                }
            }
            if(!result) break;
        }

        return result;
    }
}
