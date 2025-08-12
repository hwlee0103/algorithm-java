package baekjoononline.dijkstras.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Level : Gold 4
 * Title : 1753 최단경로
 * 문제 유형 : 다익스트라 Dijkstra's
 *
 * Started : 2025-08-12
 * Solved : 2025-0
 *
 *
 */

public class boj1753ShortestPath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int start = Integer.parseInt(br.readLine());
        List<List<Map<Integer, Integer>>> graph = new ArrayList<>();
        for(int i = 0; i < V; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            String[] str = br.readLine().split(" ");
            Map<Integer, Integer> map = new HashMap<>();
            map.put(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            graph.get(Integer.parseInt(str[0])).add(map);
        }

        System.out.println("Test");

    }
}
