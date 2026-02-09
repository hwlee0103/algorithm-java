package java_problemsolving.levelthree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : 3
 * Title : 단속카메라
 * Topic : 탐욕법(Greedy)
 *
 * Started : 2026-02-05
 * Solved : 2026-02-
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
                routes[j][0] = Integer.parseInt(Arrays.stream(inputs[j].replaceAll("\\[", "").replaceAll("]", "").split(",")).mapToInt(Integer::parseInt).toString());
            }
            System.out.print("routes: ");
            for(int k = 0; k < routes.length; ++k) {
                System.out.print(Arrays.toString(routes[k]));
                // todo:
            }
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
        int answer = 0;
        return answer;
    }
}
