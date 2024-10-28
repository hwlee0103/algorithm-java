package java_problemsolving.pcceproblems;

import java.util.Scanner;

/**
 * Level : 1
 * Title : [PCCE 기출문제] 9번 / 이웃한 칸
 * 문제 유형 : PCCE 기출문제
 *
 * Started : 2024-10-28
 * Solved : 2024-10-28
 *
 *
 */
public class NeighboringArea {
    public static int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for(int i = 0; i < 4; ++i) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if((h_check >= 0 && h_check < n) && (w_check >= 0 && w_check < n)) {
                if(board[h][w].equals(board[h_check][w_check])) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputstr = input.nextLine().split("], \\[");
        String[][] board = new String[inputstr.length][];
        for(int i = 0; i < inputstr.length; i++) {
            board[i] = inputstr[i].replaceAll("\"", "").replaceAll("]", "").replaceAll("\\[", "").split(", ");
        }
        int h = input.nextInt();
        int w = input.nextInt();
        System.out.println(solution(board, h, w));
    }
}
