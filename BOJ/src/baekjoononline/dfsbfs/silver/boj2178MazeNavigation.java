package baekjoononline.dfsbfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Level : Sliver 1
 * Title : 미로 탐색
 * 문제 유형 : DFS and BFS
 *
 * Started : 2025-07-08
 * Solved : 2025-07-09
 *
 *
 */

public class boj2178MazeNavigation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] maze = new int[N][M];
        boolean[][] visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        int answer = bfs(0, 0, visited, maze);

        System.out.println(answer);
    }

    public static int bfs(int x, int y, boolean[][] visited, int[][] maze) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        while(!queue.isEmpty()) {
            int[] pos = queue.poll();
            visited[pos[0]][pos[1]] = true;

            for(int d = 0; d < 4; ++d) {
                int nx = pos[0] + dx[d];
                int ny = pos[1] + dy[d];

                if(nx < 0 || ny < 0 || nx >= maze.length || ny >= maze[0].length || visited[nx][ny] || maze[nx][ny] == 0) { continue; }
                queue.add(new int[]{nx, ny});
                visited[nx][ny] = true;
                maze[nx][ny] = maze[pos[0]][pos[1]] + 1;
            }
        }

        return maze[maze.length - 1][maze[0].length - 1];
    }
}
