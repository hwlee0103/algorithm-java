package baekjoononline.dfsbfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Level : Sliver 2
 * Title : 섬의 개수 (DFS)
 * 문제 유형 : DFS and BFS
 *
 * Started : 2025-06-25
 * Solved : 2025-06-
 *
 *
 */

public class boj4963HowManyIslands {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input
        while(true) {
            StringTokenizer line = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(line.nextToken());
            int h = Integer.parseInt(line.nextToken());
            if(w == 0 && h == 0) break;

            int[][] map = new int[h][w];
            for(int i=0; i<h; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 연결 요소 탐색
            boolean[][] visited = new boolean[h][w];
            int result = 0;
            for(int i = 0; i < map.length; ++i) {
                for(int j = 0; j < map[0].length; ++j) {
                    if(!visited[i][j] && map[i][j] == 1) {
                        dfs(i, j, visited, map);
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void dfs(int x, int y, boolean[][] visited, int[][] map) {
        visited[x][y] = true;

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for(int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length || visited[nx][ny] || map[nx][ny] == 0) {
                continue;
            }
            dfs(nx, ny, visited, map);
        }
    }
}
