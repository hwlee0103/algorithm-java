package JavaProblemSolving.Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : Easy
 * Title : 1266. Minimum Time Visiting All Points
 * Topic : Array, Math, Geometry, Weekly Contest 164
 *
 * Started : 2026-01-12
 * Solved : 2026-01-
 * Time: -
 * Algorithm: Math, Geometry
 *
 *
 *
 */
public class MinTimeVisitingAllPoints {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Easy";
        String currentClass = "MinTimeVisitingAllPoints";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel + "/input/" + currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel + "/output/" + currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++){
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] tmp = inputLines.get(i).split("],\\[");
            int[][] points = new int[tmp.length][2];
            System.out.print("points = ");
            for(int j = 0; j < tmp.length; j++){
                String now = tmp[j].replaceAll("\\[", "").replaceAll("]", "");
                String[] tmp2 = now.split(",");
                points[j] = Arrays.stream(now.split(",")).mapToInt(Integer::parseInt).toArray();
                System.out.print(Arrays.toString(points[j]));
                if(j != tmp.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println();

            int answer = minTimeToVisitAllPoints(points);
            int output = Integer.valueOf(outputLines.get(i));
            System.out.println("-----------------");
            System.out.println("Answer: " + answer);
            System.out.print(" ==> ");
            if(answer == output){
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=======================");
        }
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;

        int[] prev = points[0];
        for(int i = 1 ; i < points.length; i++) {
            int[] next = points[i];
            if(prev[0] == next[0] || prev[1] == next[1]) {
                count += Math.max(Math.abs(prev[0] - next[0]), Math.abs(prev[1] - next[1]));
            } else {
                count += Math.min(Math.abs(prev[0] - next[0]), Math.abs(prev[1] - next[1])) + Math.abs(next[1] - next[0]);
            }
            prev = next;
        }

        // 1. 시작 점 - 목적 점(다음 점) : x, y중 한 개라도 같으면 다른 좌표만 움직이면 됨 -> 그 만큼 count
        // 2. 같은 게 없다면, 같은 게 생길 때 까지 대각선 움직임 (x, y 모두 변동) _+ 같아지면 다른거의 차이만큼 + count
        // [[1,1],[3,4],[-1,0]]
        // (1, 1) & [3, 4] -> 같은 게 없음
        //                  -> 3 -1, 4 -1 중에 2가 더 작으므로 2만큼 대각선 이동 -> [1, 1] -> [3, 3]
        //                  -> [3, 3] && [3, 4] -> 다른거 1칸
        // ans += 3; (대각선 2, 수직 1)
        // [3, 4] -> [-1, 0]
        //                  -> -1 -3, -4 -> 둘 다 -4 -> 대각선 4칸 -> ans += 4;
        // ans == 7;


        // move horizontally
        // move vertically
        // move diagonally
        return count;
    }
}
