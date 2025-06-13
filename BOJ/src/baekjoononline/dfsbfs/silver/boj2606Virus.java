package baekjoononline.dfsbfs.silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : Sliver 3
 * Title : 바이러스 Virus
 * 문제 유형 : DFS and BFS
 *
 * Started : 2025-06-13
 * Solved : 2025-0
 *
 *
 */
public class boj2606Virus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int e = input.nextInt();

        // 그래프 초기화
        List<List<Integer>> network = new ArrayList<>();
        for(int i = 0; i < v; ++i) {
            network.add(new ArrayList<>());
        }

        // 그래프 구성
        for(int i = 0; i < e; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            network.get(a).add(b);
            network.get(b).add(a);
        }

        boolean[] visited = new boolean[v];
        int result = dfs(1, visited, network);

    }

    public static int dfs(int vertex, boolean[] visited, List<List<Integer>> graph) {
        visited[vertex] = true;
        
    }
}
