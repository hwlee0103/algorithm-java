package java_problemsolving.leveltwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        }
    }

    public static int solution(String dirs) {
        int answer = 0;
        return answer;
    }
}
