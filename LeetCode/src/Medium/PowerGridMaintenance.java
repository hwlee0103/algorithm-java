package Medium;

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
 * Algorithm:
 *
 *
 *
 */

public class PowerGridMaintenance {
    public static void main(String[] args) throws IOException {
        String currentLevel = "Medium";
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
            int[][] connections = new int[tmpStr.length][tmpStr.length];
            for(int j = 0; j < tmpStr.length; j++) {
                String[] tmp = tmpStr[j].replaceAll("\\[", "").replaceAll("]", "").split(",");
                connections[j][0] = Integer.parseInt(tmp[0]);
                connections[j][1] = Integer.parseInt(tmp[1]);
            }
            tmpStr = inputs[2].split("],\\[");
            int[][] queries = new int[tmpStr.length][tmpStr.length];
            for(int j = 0; j < tmpStr.length; j++) {
                String[] tmp = tmpStr[j].replaceAll("\\[", "").replaceAll("]", "").split(",");
                queries[j][0] = Integer.parseInt(tmp[0]);
                queries[j][1] = Integer.parseInt(tmp[1]);
            }

        }
    }

    public static class Node {
        int num;
        boolean online = true;

        //Node leftNode;
        //Node rightNode;
        Node() {
        }

        Node(int num) {
            this.num = num;
        }
        /*Node(int c, boolean online, Node leftNode, Node rightNode) {
            this.c = c;
            this.online = online;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }*/
    }

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        // 그래프 구성(연결 리스트)
        // 연결 요소로 DFS / BFS 탐색
        // 1. 그래프 구성
        // 2. [1, x] 일 때 a. x가 off이고 i. x에 연결된 노드가 없다면 -1
        //                             ii. 있다면 가장 최소 숫자 ans에 in
        //.               b. x가 on 이면 -> ans에 x in
        //    [2, x] 일 때 a. x가 on 이면 -> off로 바꾸고 연결 요소에서 제외
        //                b. x가 off 이면 -> 상태 유지
        // 3. ans return
        // todo - 구조체를 정의해서 node로 쓸 것인지
        // 연결 리스트로 만들면 on/off를 넣어도 될 듯?
        // Node 정의에서 leftNode, rightNode가 필요 없을지도


        // headnode + 연결리스트 -> 이게 될지..?
        // on.off 관리용 배열을 따로 만든다면?
        List<PriorityQueue<Integer>> stations = new ArrayList<>(c + 1);
        boolean[] online = new boolean[c + 1];
        Arrays.fill(online, true);

        for(int i = 0; i < c + 1; ++i) stations.add(new PriorityQueue<>(Comparator.comparingInt(a -> a)));
        for(int[] item: connections) {
            stations.get(item[0]).add(item[1]);
            stations.get(item[1]).add(item[0]);
        }

        int[] ans = new int[c];
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
                        arr.add(now.peek());
                    }
                }
            } else { // off
                online[query[1]] = false;
            }
        }
        ans = Arrays.stream(arr.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        return ans;
    }
}
