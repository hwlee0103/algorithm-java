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
 * Solved : 2025-08-14
 *
 *
 */

public class boj1753ShortestPath {

    // 내가 직접 작성한 코드 - Dijkstra 기본 유형 소스 참고 x
//    static final int INF = Integer.MAX_VALUE;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int V = Integer.parseInt(st.nextToken());
//        int E = Integer.parseInt(st.nextToken());
//
//        int start = Integer.parseInt(br.readLine());
//        List<List<Edge>> graph = new ArrayList<>();
//        for(int i = 0; i <= V; i++){
//            graph.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < E; i++) {
//            String[] str = br.readLine().split(" ");
//            graph.get(Integer.parseInt(str[0])).add(new Edge(Integer.parseInt(str[1]), Integer.parseInt(str[2])));
//        }
//
//        int[] distances = dijkstrasShortestPath(graph, start);
//
//        for (int i = 1; i <= V; i++) {
//            if(distances[i] == INF) {
//                System.out.println("INF");
//            } else {
//                System.out.println(distances[i]);
//            }
//        }
//
//    }
//
//    public static class Edge{
//        int to;
//        int weight;
//
//        public Edge(int to, int weight){
//            this.to = to;
//            this.weight = weight;
//        }
//    }
//
//    public static int[] dijkstrasShortestPath(List<List<Edge>> graph, int start){
//        int[] distances = new int[graph.size()];
//        Arrays.fill(distances, INF);
//        distances[start] = 0;
//        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
//        pq.offer(new Edge(start, 0));
//        while (!pq.isEmpty()){
//            Edge e = pq.poll();
//            int u = e.to;
//            int v = e.weight;
//
//            for(int i = 0; i < graph.get(u).size(); i++){
//                int node = graph.get(u).get(i).to;
//                int w = graph.get(u).get(i).weight;
//                int nextDist = v + w;
//                if(nextDist < distances[node]){
//                    distances[node] = nextDist;
//                    pq.offer(new Edge(node, nextDist));
//                }
//            }
//        }
//
//        return distances;
//    }

    //#region 수정 코드 - start
    static final int INF = 1_000_000_000;

    // 인접 리스트 용: 목적지, 간선 가중치
    static class Edge{
        int to, weight;
        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    // Priority Queue 용: 정점, 현재까지의 누적 최단경로 후보 거리
    static class Node {
        int v, dist;
        Node(int v, int dist) {
            this.v = v;
            this.dist = dist;
        }
    }

    static List<List<Edge>> graph;
    static int[] dist;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V =  Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int start = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        for(int i = 0; i <= V; i++){
            graph.add(new ArrayList<>());
        }
        dist = new int[V + 1];
        Arrays.fill(dist, INF);

        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, w));
        }

        dijkstra(start);

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= V; ++i) {
            sb.append(dist[i] == INF ? "INF": dist[i]).append('\n');
        }
        System.out.println(sb);
    }

    static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.dist));
        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while(!pq.isEmpty()) {

        }
    }
    //#region 수정 코드 - end
}
