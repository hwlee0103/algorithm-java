package JavaProblemSolving.Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Level : Easy
 * Title : 69. Sqrt
 * Topic : Math, Binary Search
 *
 * Started : 2026-01-08
 * Solved : 2026-01-08
 * Time: -
 * Algorithm: Math
 *
 *
 *
 */
public class Sqrt {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Easy";
        String currentClass = "Sqrt";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            int query = Integer.valueOf(inputLines.get(i));
            System.out.println("n = " + query);
            int answer = mySqrt(query);
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

    public static int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
}
