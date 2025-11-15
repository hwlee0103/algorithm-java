package JavaProblemSolving.Medium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Level : Medium
 * Title : 48. Rotate Image
 * Topic : Array, Math, Matrix
 *
 * Started : 2025-11-05
 * Solved : 2025-11-05
 * Time: 17 min 00 sec
 * Algorithm: Simulation 사용
 *
 *
 */

public class RotateImage {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Medium";
        String currentClass = "RotateImage";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] inputMatrix = inputLines.get(i).split("],\\[");

            int n = 0; // todo - size
            int[][] matrix = new int[n][n];
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] original = new int[n][n];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                original[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                matrix[j][n-i-1] = original[i][j];
            }
        }
    }
}
