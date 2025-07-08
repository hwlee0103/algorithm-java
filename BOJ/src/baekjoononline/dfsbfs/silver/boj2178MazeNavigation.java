package baekjoononline.dfsbfs.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Level : Sliver 1
 * Title : 미로 탐색
 * 문제 유형 : DFS and BFS
 *
 * Started : 2025-07-08
 * Solved : 2025-
 *
 *
 */

public class boj2178MazeNavigation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[][] maze = new int[N + 1][M + 1];

        for(int i = 1; i <= N; ++i) {
            String str = input.next();
            for(int j = 1; j <= M; ++j) {
                maze[i][j] = str.charAt(j - 1) - '0';
            }
        }

        boolean[][] visited = new boolean[N + 1][M + 1];
        int answer = bfs(1, 1, visited, maze);

        System.out.println(answer);
    }

    public static class Pos {
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int bfs(int x, int y, boolean[][] visited, int[][] maze) {
        Queue<Pos> queue = new LinkedList<>();
        queue.add(new Pos(x, y));

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        while(!queue.isEmpty()) {
            Pos pos = queue.poll();
            visited[pos.x][pos.y] = true;

            for(int d = 0; d < 4; ++d) {
                int nx = pos.x + dx[d];
                int ny = pos.y + dy[d];

                if(nx <= 0 || ny <= 0 || nx > maze.length || ny > maze[0].length || visited[nx][ny] || maze[nx][ny] == 0) { continue; }
                queue.add(new Pos(nx, ny));
            }
        }

        return maze[maze.length - 1][maze[0].length - 1];
    }
}
