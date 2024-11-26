package java_problemsolving.leveltwo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 게임 맵 최단거리
 * 문제 유형 : 깊이/너비 우선 탐색(DFS/BFS)
 *
 * Started : 2024-11-26
 * Solved : 2024-11-26
 *
 *
 */
public class GameMapShortestDistance {
    public int solution(int[][] maps) {
        int[][] visited = new int[maps.length][maps[0].length];
        return bfs(0, 0, maps, visited);
    }

    public class Pair{
        int x;
        int y;
        int dist;

        public Pair(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public int bfs(int startX, int startY, int[][] maps, int[][] visited) {
        int distance = -1;
        // 탐색 순서 출력용
//        StringBuilder sb = new StringBuilder();
        Queue<Pair> q = new LinkedList<>();

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        q.add(new Pair(startX, startY, 1));
        visited[startX][startY] = 1;
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int x = pair.x;
            int y = pair.y;
            int dist = pair.dist;
            if(x == maps.length - 1 && y == maps[0].length - 1) {
                distance = dist;
                break;
            }

//            sb.append("(" + x + ", " + y + ")" + " : " + dist + " -> ");
            for(int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if(nextX < 0 || nextY < 0 || nextX >= maps.length || nextY >= maps[0].length) continue;
                if(visited[nextX][nextY] == 0 && maps[nextX][nextY] != 0) {
                    visited[nextX][nextY] = 1;
                    q.add(new Pair(nextX, nextY, dist + 1));
                }
            }
        }

//        System.out.println(sb.toString());
        return distance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split("],\\[");
        String[][] spStr = new String[str.length][];
        for(int i = 0; i < str.length; i++) {
            spStr[i] = str[i].replaceAll("]", "").replaceAll("\\[", "").split(",");
        }
        int[][] map = new int[spStr.length][spStr[0].length];
        for(int i = 0; i < spStr.length; i++) {
            for(int j = 0; j < spStr[i].length; j++) {
               map[i][j] = Integer.parseInt(spStr[i][j]);
            }
        }
        System.out.println(new GameMapShortestDistance().solution(map));
    }
}
