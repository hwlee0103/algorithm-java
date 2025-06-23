package baekjoononline.dfsbfs.silver;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Sliver 1
 * Title : 안전 영역 (DFS)
 * 문제 유형 : DFS and BFS
 *
 * Started : 2025-06-23
 * Solved : 2025-06-
 *
 *
 */

public class boj2468SafetyZone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] area = new int[n][n];
        int maxHeight = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                area[i][j] = input.nextInt();
                maxHeight = Math.max(maxHeight, area[i][j]);
            }
        }

        boolean[][] visited = new boolean[n][n];
        int result = 0;
        for(int k = 1; k < maxHeight; ++k) {
            for(int i=0; i<n; i++) {
                Arrays.fill(visited[i], false);
            }

            int tmp = 0;
            for(int i = 0; i<n; i++) {
                for(int j = 0; j<n; j++) {
                    if(!visited[i][j] && (area[i][j] > k)) {
                        dfs(i, j, area, visited, k);
                        tmp++;
                    }
                }
            }

            result = Math.max(result, tmp);
        }

        System.out.println(result);

    }

    public static void dfs(int x, int y, int[][] area, boolean[][] visited, int height) {
        visited[x][y] = true;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= area.length || ny >= area.length || visited[nx][ny] || area[nx][ny] <= height) {
                continue;
            } else {
                dfs(nx, ny, area, visited, height);
            }
        }
    }
}
