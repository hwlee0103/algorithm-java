package JavaProblemSolving.Medium;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Level : Medium
 * Title : 200. Number of Islands
 * Topic : Array, Depth-First Search, Breadth-First Search, Union Find, Matrix
 *
 * Started : 2025-11-07
 * Solved : 2025-11-07
 * Time: 14 min 37 sec
 * Algorithm: BFS 사용
 *
 *
 *
 */

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        // bfs 연결요소 탐색
        // visited =false 이고 1인 경우만 bfs 실행
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        int cnt = 0;
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    cnt += bfs(i, j, grid, visited, m, n);
                }
            }
        }
        return cnt;
    }

    public class Position {
        int x;
        int y;
        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private int bfs(int startX, int startY, char[][] grid, boolean[][] visited, int m, int n) {
        Queue<Position> pos = new ArrayDeque<>();
        pos.offer(new Position(startX, startY));
        visited[pos.peek().x][pos.peek().y] = true;

        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        while(!pos.isEmpty()) {
            Position now = pos.poll();

            for(int i = 0; i < 4; ++i) {
                int nextX = now.x + dx[i];
                int nextY = now.y + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= m || nextY >= n) continue;
                if(!visited[nextX][nextY] && grid[nextX][nextY] == '1') {
                    visited[nextX][nextY] = true;
                    pos.offer(new Position(nextX, nextY));
                }
            }
        }
        return 1;
    }
}
