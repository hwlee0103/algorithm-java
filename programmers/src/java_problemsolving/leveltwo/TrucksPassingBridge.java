package java_problemsolving.leveltwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 2
 * Title : 42583 다리를 지나는 트럭
 * 문제 유형 : 스택/큐
 *
 * Started : 2025-10-28
 * Solved : 2025-
 *
 *
 */

public class TrucksPassingBridge {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("programmers/src/java_problemsolving/leveltwo/TrucksPassingBridge_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/leveltwo/TrucksPassingBridge_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        int idx = 0;
        for(String line : inputLines) {
            System.out.println("Query #" + String.valueOf(idx + 1));
            String[] inputs = line.split(" ");

            int bridge_length = Integer.parseInt(inputs[0]);
            int weight = Integer.parseInt(inputs[1]);
            int[] truch_weights = Arrays.stream(inputs[2].split(",")).mapToInt(Integer::parseInt).toArray();

            int answer = solution(bridge_length, weight, truch_weights);

            System.out.println("-----------------");
            System.out.println("Answer #" + answer);
            if(answer == Integer.parseInt(outputLines.get(idx))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=======================");
        }
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        return answer;
    }
}
