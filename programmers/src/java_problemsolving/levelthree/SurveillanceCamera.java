package java_problemsolving.levelthree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Level : 3
 * Title : 단속카메라
 * Topic : 탐욕법(Greedy)
 *
 * Started : 2026-02-05
 * Solved : 2026-02-12
 * Time: -
 * Algorithm: Greedy, 이어지는 구간 찾기
 * 1 <= cars <= 10000
 * route[i,0]: i 번째 차량의 진입 시간
 * route[i,1]: i 번째 차량의 나간 시간
 *
 * 우선순위 큐 활용, 앞에가 낮은 순으로 넣어둔다면?
 * prev를 첫 번째로 설정
 * 계속 큐에서 가장 top을 prev와의 범위를 비교해서
 * 범위가 겹치면 prev에 범위 합치기
 * 안겹치면 count+1 하고 prev를 현재 보는 큐의 top으로 교체
 *
 *
 *
 */
public class SurveillanceCamera {
    public static void main(String[] args) throws IOException {
        String currentLevel = "java_problemsolving/levelthree";
        String currentClass = "SurveillanceCamera";
        String site = "programmers";
        Path inputPath = Paths.get(site + "/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get(site + "/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] inputs = inputLines.get(i).split("], \\[");
            int[][] routes = new int[inputs.length][2];
            for(int j = 0; j < inputs.length; j++) {
                routes[j] = Arrays.stream(inputs[j].replaceAll("\\[", "").replaceAll("]", "").split(",")).mapToInt(Integer::parseInt).toArray();
            }
            System.out.print("routes: ");
            for(int k = 0; k < routes.length; ++k) {
                System.out.print(Arrays.toString(routes[k]));
            }
            System.out.println();
            int answer = solution(routes);

            System.out.println("---------------");
            System.out.println("Answer: " + answer);
            System.out.print(" ==> ");
            if(answer == Integer.parseInt(outputLines.get(i))){
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=====================");
        }
    }

    public static int solution(int[][] routes) {
        int count = 0;
        int[] prev = new int[2];
        int[] now = new int[2];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int i = 0; i < routes.length; ++i) {
            pq.add(new int[]{routes[i][0], routes[i][1]});
        }

        prev = pq.poll();
        while(!pq.isEmpty()) {
            now = pq.poll();
            if(prev[0] <= now[0] && prev[1] >= now[0]) {
                // todo: 범위를 넓게 합치는 게 아니라 작게 합쳐야 할 듯?
                prev = new int[]{now[0], Math.min(prev[1], now[1])};
            } else {
                count++;
                prev = now;
            }
        }
        return count + 1;
    }
}
