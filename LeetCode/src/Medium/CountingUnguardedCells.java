package Medium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Level : Medium
 * Title : 2257. Count Unguarded Cells in the Grid
 * 문제 유형 : Array, Matrix, Simulation, Biweekly Contest 77
 *
 * Started : 2025-11-02
 * Solved : 2025-11-02
 *
 *
 */

public class CountingUnguardedCells {
    public static void main(String[] args) throws IOException {
        String currentLevel = "Medium";
        String currentClass = "CountingUnguardedCells";
        Path inputPath = Paths.get("./src/" + currentLevel +"/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("./src/" + currentLevel +"/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++){
            System.out.println("Query #" + String.valueOf(i+1));
            String[] inputs = inputLines.get(i).split(" ");
            int m = Integer.parseInt(inputs[0]);
            System.out.println("m: " + inputs[0]);
            int n = Integer.parseInt(inputs[1]);
            System.out.println("n: " + inputs[1]);
            System.out.println("guards: " + inputs[2]);
            String[] guardsStrings = inputs[2].split("],\\[");
            int[][] guards = new int[guardsStrings.length][2];
            for(int j = 0; j < guardsStrings.length; j++){
                guards[j][0] = Integer.parseInt(guardsStrings[j].replaceAll("\\[", "").replaceAll("]", ""));
            }

            System.out.println("walls: " + inputs[3]);
            String[] wallsStrings = inputs[3].split("],\\[");
            int[][] walls = new int[wallsStrings.length][2];
            for(int j = 0; j < wallsStrings.length; j++){
                walls[j][0] = Integer.parseInt(wallsStrings[j].replaceAll("\\[", "").replaceAll("]", ""));
            }

            System.out.println("----------------------------");
            int answer = countUnguarded(m, n, guards, walls);
            System.out.println("============================");
            System.out.println("answer: " + answer);
            System.out.print(" ==> ");
            if(answer == Integer.parseInt(outputLines.get(i))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
        }
    }

    // Simulation
    public static int countUnguarded2(int m, int n, int[][] guards, int[][] walls) {
        int answer = 1;
        char[][] board = new char[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(board[i], '.');
        }

        return answer;
    }

    public static class Cell {
        int x;
        int y;
        int dir = -1;
        Cell(int x, int y){this.x = x; this.y = y;}
        Cell(int x, int y, int dir){this.x = x; this.y = y; this.dir = dir;}
    }

    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        // dfs & bfs - connected component
        Character[][] board = new Character[m][n];
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[0].length; ++j) {
                board[i][j] = 'C'; // Cell
            }
        }
        for(int i = 0; i < walls.length; ++i) {
            board[walls[i][0]][walls[i][1]] = 'W'; // Wall
        }

        // bfs - queue
        Queue<Cell> queue = new LinkedList<>();
        for(int i = 0; i < guards.length; ++i) {
            queue.offer(new Cell(guards[i][0], guards[i][1]));
            board[guards[i][0]][guards[i][1]] = 'G'; // Guard
        }
        boolean[][] answer = bfs(queue, m, n, board);

        int count = 0;
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                if(!answer[i][j] && board[i][j] != 'G' && board[i][j] != 'W') count++;
            }
        }
        return count;
    }

    public static boolean[][] bfs(Queue<Cell> queue, int m, int n, Character[][] board) {
        boolean[][] answer = new boolean[m][n];

        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        while(!queue.isEmpty()) {
            Cell now = queue.poll();
            answer[now.x][now.y] = true;
            // check
            // sight over-lapping -> visited could also be seen
            if(now.dir == -1) { // guard point
                for(int i = 0; i < 4; ++i) {
                    int nextX = now.x + dx[i];
                    int nextY = now.y + dy[i];
                    int dir = i;

                    // non-walls, direction, idx, non-other guard
                    if(nextX < 0 || nextY < 0 || nextX >= m || nextY >= n) continue;
                    if(board[nextX][nextY] == 'G' || board[nextX][nextY] == 'W') continue;
                    queue.offer(new Cell(nextX, nextY, dir));
                }
            } else { // one-direction
                int dir = now.dir;
                int nextX = now.x + dx[dir];
                int nextY = now.y + dy[dir];

                if(nextX < 0 || nextY < 0 || nextX >= m || nextY >= n) continue;
                if(board[nextX][nextY] == 'G' || board[nextX][nextY] == 'W') continue;
                queue.offer(new Cell(nextX, nextY, dir));
            }
        }

        return answer;
    }
}
