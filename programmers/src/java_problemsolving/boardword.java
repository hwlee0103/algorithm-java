package java_problemsolving;

import java.util.LinkedList;
import java.util.Scanner;

public class boardword {
    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static boolean solution(String[][] board, String word) {
        boolean answer = false;
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if((word.charAt(0) + "").equals(board[i][j])) {
                    answer = bfs(i, j, board, word);
                }
                if(answer == true) break;
            }
            if(answer == true) break;
        }
        return answer;
    }
    public static boolean bfs(int startx, int starty, String[][] board, String word) {
        String result = "";
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        LinkedList<Node> que = new LinkedList<>();
        int[] distx = {1, 0, -1, 0};
        int[] disty = {0, 1, 0, -1};

        int idx = 0;
        visited[startx][starty] = true;
        que.add(new Node(startx, starty));

        while(!que.isEmpty()) {
            Node now = que.pop();
            visited[now.x][now.y] = true;
            result += board[now.x][now.y];

            if(!board[now.x][now.y].equals(word.charAt(idx) + "")) {
                result = result.substring(0, result.length() - 1);
                continue;
            }
            idx++;

            for(int i = 0; i < 4; ++i) {
                int nextx = now.x + distx[i];
                int nexty = now.y + disty[i];

                if(nextx < 0 || nextx > row || nexty < 0 || nexty > col) {
                    continue;
                }

                if(!visited[nextx][nexty]) {
                    visited[nextx][nexty] = true;
                    que.add(new Node(nextx, nexty));
                }
            }
        }
        return (result.equals(word)) ? true : false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().replaceAll("\"", "");
        String[] spStr = str.split("], \\[");
        String[][] board = new String[spStr.length][6];
        for(int i = 0; i <spStr.length; i++) {
            board[i] = spStr[i].replaceAll("]", "").replaceAll("\\[", "").split(", ");
        }
        String word = input.nextLine();
        System.out.println(solution(board, word));
    }
}
