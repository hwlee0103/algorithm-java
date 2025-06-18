package baekjoononline.dfsbfs.silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : Sliver 2
 * Title : 연결요소의 개수 (DFS)
 * 문제 유형 : DFS and BFS
 *
 * Started : 2025-06-18
 * Solved : 2025-06-18
 *
 *
 */
public class boj11724NumberOfConnectedComponent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[n + 1];
        int result = 0;
        for(int i = 1; i<=n; i++) {
            if(!visited[i]) {
                result++;
                dfs(i, visited, graph);
            }
        }

        System.out.println(result);
    }

    public static void dfs(int i, boolean[] visited, List<List<Integer>> graph) {
        visited[i] = true;

        for(int j : graph.get(i)) {
            if(!visited[j]) {
                dfs(j, visited, graph);
            }
        }
    }
}
