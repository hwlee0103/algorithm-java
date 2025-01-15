package java_problemsolving.levelthree;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 3
 * Title : 입국심사
 * 문제 유형 : 이분 탐색
 *
 * Started : 2025-01-15
 * Solved : 2025-01-
 *
 *
 */

public class ImmigrationScreening {
    public long solution(int n, int[] times) {
        long answer = 0;



        return answer;
    }

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("programmers/src/java_problemsolving/levelthree/ImmigrationScreening_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/levelthree/ImmigrationScreening_input.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            String line = inputLines.get(i);
            String[] words = line.split(" \\[");
            int n = Integer.parseInt(words[0]);
            int[] times = Arrays.stream(words[1].replaceAll("]", "").split(", ")).mapToInt(Integer::parseInt).toArray();

            long answer = new ImmigrationScreening().solution(n, times);

            long expected = Long.parseLong(outputLines.get(i));

            System.out.println("expected: " + expected + ", answer: " + answer);
            System.out.println("                     -----> " + ((expected != answer) ? "wrong" : "correct"));
        }

    }
}
