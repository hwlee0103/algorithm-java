package JavaProblemSolving.Medium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Level : Medium
 * Title : 3607. Power Grid Maintenance
 * Topic : Array, Hash Table, Depth-First Search, Breadth-First Search, Union Find, Graph, Heap (Priority Queue), Ordered Set, Weekly Contest 457
 *
 * Started : 2025-11-06
 * Solved : 2025-11-
 * Time: -
 * Algorithm: Graph, PriorityQueue, Simulation 사용
 *
 *
 *
 */

public class PowerGridMaintenance {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Medium";
        String currentClass = "PowerGridMaintenance";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] inputs = inputLines.get(i).split(" ");
            int c = Integer.parseInt(inputs[0]);
            String[] tmpStr = inputs[1].split("],\\[");
            int[][] connections = new int[tmpStr.length][2];
            if(tmpStr[0].equals("[]")) {
                connections = new int[0][0];
            } else {
                for(int j = 0; j < tmpStr.length; j++) {
                    String[] tmp = tmpStr[j].replaceAll("\\[", "").replaceAll("]", "").split(",");
                    connections[j][0] = Integer.parseInt(tmp[0]);
                    connections[j][1] = Integer.parseInt(tmp[1]);
                }
            }
            System.out.println("connections: " + Arrays.deepToString(connections));
            tmpStr = inputs[2].split("],\\[");
            int[][] queries = new int[tmpStr.length][2];
            for(int j = 0; j < tmpStr.length; j++) {
                String[] tmp = tmpStr[j].replaceAll("\\[", "").replaceAll("]", "").split(",");
                queries[j][0] = Integer.parseInt(tmp[0]);
                queries[j][1] = Integer.parseInt(tmp[1]);
            }
            System.out.println("queries: " + Arrays.deepToString(queries));
            System.out.println("-----------------");
            int[] answer = processQueries(c,  connections, queries);
            System.out.println("answer: " + Arrays.toString(answer));
            System.out.print(" ==> ");
            if(Arrays.toString(answer).equals(outputLines.get(i).replaceAll(",", ", "))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("========================");
        }
    }

    public static int[] processQueries(int c, int[][] connections, int[][] queries) {
        // 그래프 구성(연결 리스트)
        // 연결 요소로 DFS / BFS 탐색
        // 1. 그래프 구성
        // 2. [1, x] 일 때 a. x가 off이고 i. x에 연결된 노드가 없다면 -1
        //                             ii. 있다면 가장 최소 숫자 ans에 in
        //.               b. x가 on 이면 -> ans에 x in
        //    [2, x] 일 때 a. x가 on 이면 -> off로 바꾸고 연결 요소에서 제외
        //                b. x가 off 이면 -> 상태 유지
        // 3. ans return

        List<PriorityQueue<Integer>> stations = new ArrayList<>(c + 1);
        boolean[] online = new boolean[c + 1];
        Arrays.fill(online, true);

        for(int i = 0; i < c + 1; ++i) stations.add(new PriorityQueue<>(Comparator.comparingInt(a -> a)));
        for(int[] item: connections) {
            stations.get(item[0]).add(item[1]);
            stations.get(item[1]).add(item[0]);
        }
        // check
        System.out.println("stations: " + Arrays.deepToString(stations.toArray(new PriorityQueue[0])));

        List<Integer> arr = new ArrayList<>();
        for(int[] query: queries) {
            PriorityQueue<Integer> now = stations.get(query[1]);
            if(query[0] == 1) { // on
                if(online[query[1]]) { // online 이면
                    arr.add(query[1]);
                } else { // offline 이면
                    if(now.size() <= 0) {
                        arr.add(-1);
                    } else {
                        if(online[now.peek()]) {
                            arr.add(now.peek());
                        } else {
                            now.poll();
                            arr.add(now.peek());
                        }
                    }
                }
            } else { // off
                if(online[query[1]]) {
                    online[query[1]] = false;
                    // todo - 연결요소 제외
                }
            }
        }

        // todo = null 방어로직 & return 생각해보기
        if(arr == null || arr.isEmpty()) {
            return new int[]{-1, -1};
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
