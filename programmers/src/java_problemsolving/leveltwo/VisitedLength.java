package java_problemsolving.leveltwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : 2
 * Title : 방문길이
 * Topic : Summer/Winter Coding(~2018)
 *
 * Started : 2026-02-13
 * Solved : 2026-02-
 * Time: -
 * Algorithm: Simulation?
 * 제한: dirs의 길이는 500이하의 자연수
 * bfs, 범위: +-5, 단 방문 시 포인트 방문이 아니라 '경로'가 방문되었는지 여부가 중요
 *
 */
public class VisitedLength {
    public static void main(String[] args) throws IOException {
        String currentLevel = "java_problemsolving/leveltwo";
        String currentClass = "VisitedLength";
        String site = "programmers";
        Path inputPath = Paths.get(site + "/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get(site + "/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++){
            System.out.println("Query #" + String.valueOf(i + 1));
            String dirs = inputLines.get(i).replaceAll("\"", "");
            System.out.println("dirs: " + dirs);
            int answer = solution(dirs);

            System.out.println("---------------");
            System.out.println("Answer: " + answer);
            System.out.print(" ==> ");
            if(answer == Integer.parseInt(outputLines.get(i))){
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=====================");
        }
    }

    static class Position{
        int x = 0;
        int y = 0;
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static int solution(String dirs) {
        int answer = 0;
        Position now = new Position(0, 0);

        return answer;
    }
}
