package baekjoononline.dfsbfs.gold;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Gold 5
 * Title : 적록색약 (DFS)
 * 문제 유형 : DFS and BFS
 *
 * Started : 2025-06-20
 * Solved : 2025-06-20
 *
 *
 */

public class boj10026RedGreenColorBlindness {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[][] map = new char[n][n];
        for(int i=0; i<n; i++) {
            String s = input.next();
            for(int j=0; j<n; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        boolean[][] visited = new boolean[n][n];

        // 각 색의 연결구역 확인
        int total = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                char now = map[i][j];
                if(!visited[i][j]) {
                    dfs(now, map, i, j, visited);
                    total++;
                }
            }
        }

        for(int i=0; i<n; i++) {
            Arrays.fill(visited[i], false);
        }
        int colorBlindCnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                char now = map[i][j];
                if(!visited[i][j]) {
                    dfs(now, map, i, j, visited);
                    colorBlindCnt++;
                }
            }
        }

        System.out.println(total + " " + colorBlindCnt);
    }

    public static void dfs(char now, char[][] map, int x, int y, boolean[][] visited) {
        visited[x][y] = true;
        if(map[x][y] == 'G') { map[x][y] = 'R'; }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= map.length || ny < 0 || ny >= map[0].length || visited[nx][ny]) { continue; }
            else if(now == map[nx][ny]){
                dfs(now, map, nx, ny, visited);
            }
        }

    }
}
