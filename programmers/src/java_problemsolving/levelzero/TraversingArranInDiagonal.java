package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 이차원 배열 대각선 순회하기
 * 문제 유형 : 이차원 리스트(배열)
 *
 * Started : 2024-09-25
 * Solved : 2024-09-25
 *
 */
public class TraversingArranInDiagonal {
    public long solution(int[][] board, int k) {
        long answer = 0;
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[0].length; ++j) {
                if(i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split("],\\[");
        int[][] board = new int[str.length][str.length];
        for(int i = 0; i < str.length; ++i) {
            String[] spStr = str[i].replaceAll("\\[", "").replaceAll("]", "").split(", ");
            for(int j = 0; j < spStr.length; ++j) {
                board[i][j] = Integer.parseInt(spStr[j]);
            }
        }
        int k = input.nextInt();
        System.out.println(new TraversingArranInDiagonal().solution(board, k));
    }
}
