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
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int start = Integer.parseInt(br.readLine());
        List<List<Edge>> graph = new ArrayList<>();
        for(int i = 0; i <= V; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            String[] str = br.readLine().split(" ");
            graph.get(Integer.parseInt(str[0])).add(new Edge(Integer.parseInt(str[1]), Integer.parseInt(str[2])));
        }

        int[] distances = dijkstrasShortestPath(graph, start);

        for (int i = 1; i <= V; i++) {
            if(distances[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(distances[i]);
            }
        }

    }

    public static class Edge{
        int to;
        int weight;

        public Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    public static int[] dijkstrasShortestPath(List<List<Edge>> graph, int start){
        int[] distances = new int[graph.size()];
        Arrays.fill(distances, INF);
        distances[start] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.offer(new Edge(start, 0));
        while (!pq.isEmpty()){
            Edge e = pq.poll();
            int u = e.to;
            int v = e.weight;

            for(int i = 0; i < graph.get(u).size(); i++){
                int node = graph.get(u).get(i).to;
                int w = graph.get(u).get(i).weight;
                int nextDist = v + w;
                if(nextDist < distances[node]){
                    distances[node] = nextDist;
                    pq.offer(new Edge(w, nextDist));
                }
            }
        }

        return distances;
    }
}
