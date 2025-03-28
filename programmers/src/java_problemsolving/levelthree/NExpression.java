package java_problemsolving.levelthree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Level : 3
 * Title : N으로 표현
 * 문제 유형 : 동적계획법 Dynamic Programming
 *
 * Started : 2025-03-28
 * Solved : 2025-
 *
 *
 */

public class NExpression {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("./NExpression_input.txt");
        Path outputPath = Paths.get("./NExpression_output.txt");

        List<String> inputList = Files.readAllLines(inputPath);
        List<String> outputList = Files.readAllLines(outputPath);

        for(int i = 0; i < inputList.size(); i++) {
            int answer = 0;


            if(answer == Integer.valueOf(outputList.get(i))) {
                System.out.println("Success !");
            } else {
                System.out.println("Fail !");
            }
        }
    }
}
