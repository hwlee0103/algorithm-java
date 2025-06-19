package baekjoononline.dfsbfs.silver;

import java.util.Scanner;

/**
 * Level : Sliver 2
 * Title : 유기농 배추 (DFS)
 * 문제 유형 : DFS and BFS
 *
 * Started : 2025-06-19
 * Solved : 2025-06-19
 *
 *
 */
public class boj1012OrganicCabbage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int m = input.nextInt();
            int n = input.nextInt();
            int k = input.nextInt();

            int[][] arr = new int[m][n];
            boolean[][] visited = new boolean[m][n];

            for(int i = 0; i < k; ++i) {
                int x = input.nextInt();
                int y = input.nextInt();

                arr[x][y] = 1;
            }

            int result = 0;
            for(int i = 0; i < m; ++i) {
                for(int j = 0; j < n; ++j) {
                    if(visited[i][j] == false && arr[i][j] == 1) {
                        dfs(arr, i, j, visited);
                        result++;
                    }
                }
            }

            System.out.println(result);
        }
    }

    public static void dfs(int[][] arr, int x, int y, boolean[][] visited) {
        visited[x][y] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int i = 0;i < dx.length;i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX < 0 || nextX >= arr.length || nextY < 0 || nextY >= arr[0].length || visited[nextX][nextY] == true || arr[nextX][nextY] == 0) {
                continue;
            }
            dfs(arr, nextX, nextY, visited);
        }
    }
}
