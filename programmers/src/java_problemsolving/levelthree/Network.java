package java_problemsolving.levelthree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Level : 3
 * Title : 네트워크
 * 문제 유형 : DFS/BFS
 *
 * Started : 2024-09-06
 * Solved : 2024-09-06
 *
 *
 */
public class Network {

    public static class Coord {
        int x;
        int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[][] visited = new boolean[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(computers[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j, computers, visited);
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void bfs(int rootx, int rooty, int[][] computers, boolean[][] visited) {
        int n = computers.length;
        LinkedList<Coord> que = new LinkedList<>();
        visited[rootx][rooty] = true;
        que.add(new Coord(rootx, rooty));

        while(!que.isEmpty()) {
            Coord now = que.pop();
            visited[now.x][now.y] = true;

            for(int x = 0; x < n; ++x) {
                if(computers[x][now.y] == 1 && !visited[x][now.y]) {
                    visited[x][now.y] = true;
                    que.add(new Coord(x, now.y));
                }
            }

            for(int y = 0; y < n; ++y) {
                if(computers[now.x][y] == 1 && !visited[now.x][y]) {
                    visited[now.x][y] = true;
                    que.add(new Coord(now.x, y));
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int[][] computers = new int[n][n];
        String[] computerStr = input.nextLine().split("], \\[");
        for(int i = 0; i < n; ++i) {
            String str = computerStr[i].replaceAll("\\[", "");
            String[] spstr = str.replaceAll("]", "").split(", ");
            computers[i] = Arrays.stream(spstr).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(solution(n, computers));
    }
}
