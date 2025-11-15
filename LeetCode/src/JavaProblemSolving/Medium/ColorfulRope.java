package JavaProblemSolving.Medium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : Medium
 * Title : 1578. Minimum Time to Make Rope Colorful
 * 문제 유형 : Array, String, Dynamic Programming, Greedy, Weekly Contest 205
 *
 * Started : 2025-11-03
 * Solved : 2025-11-03
 *
 *
 */

public class ColorfulRope {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Medium";
        String currentClass = "ColorfulRope";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i+1));
            String[] inputs = inputLines.get(i).split(" ");
            String colors = inputs[0].replaceAll("\"", "");
            String[] timeStr = inputs[1].replaceAll("\\[", "").replaceAll("]", "").split(",");
            int[] neededTime = Arrays.stream(timeStr).mapToInt(Integer::parseInt).toArray();

            System.out.println("-------------------");
            int answer = minCost(colors, neededTime);
            System.out.println("Answer: " + answer);
            System.out.println(" ==> ");
            if(answer == Integer.parseInt(outputLines.get(i))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("============================");
        }
    }
    public static int minCost(String colors, int[] neededTime) {
        int answer = 0;
        char prev = colors.charAt(0);
        int rangeTime = neededTime[0];
        int maxTime = neededTime[0];

        for(int i = 1; i < colors.length() ; ++i) {
            char now = colors.charAt(i);
            int nowTime = neededTime[i];
            if(prev == now) {
                // 같은 색 일 경우 - maxTime 업데이트
                maxTime = Math.max(maxTime, nowTime);
                // 같은 색 구간 합
                rangeTime += nowTime;
            } else {
                // 이전 같은 색 구간 합에서 - maxTime
                // 결과 time 에 결과 값 더해주기
                answer += (rangeTime - maxTime);

                // 새로 세팅
                rangeTime = nowTime;
                prev = now;
                maxTime = nowTime;
            }
        }

        // 마지막 구간 처리
        answer += (rangeTime - maxTime);

        return answer;
    }
}
