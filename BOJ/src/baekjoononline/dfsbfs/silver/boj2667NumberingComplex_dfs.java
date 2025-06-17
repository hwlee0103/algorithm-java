package baekjoononline.dfsbfs.silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : Sliver 1
 * Title : 단지번호붙이기 (DFS) NumberingComplex_dfs
 * 문제 유형 : DFS and BFS
 *
 * Started : 2025-06-17
 * Solved : 2025-06-
 *
 *
 */

public class boj2667NumberingComplex_dfs {
    public static int num = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        for(int i=0; i<n; i++) {
            String s = input.next();
            for(int j=0; j<n; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(!visited[i][j] && arr[i][j] == 1) {
                    ++num;
                    list.add(dfs(i, j, visited, arr));
                }
            }
        }

        list.sort(Integer::compareTo);
        System.out.println(num);
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static int dfs(int i, int j, boolean[][] visited, int[][] arr) {
        int cnt = 0;
        visited[i][j] = true;
        cnt++;
//        arr[i][j] = num;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int k = 0; k < 4; ++k) {
            int x = i + dx[k];
            int y = j + dy[k];

            if(x < 0 || y < 0 || x >= arr.length || y >= arr.length || visited[x][y] || arr[x][y] == 0) {
                continue;
            } else {
                cnt += dfs(x, y, visited, arr);
            }

        }

        return cnt;
    }

}
