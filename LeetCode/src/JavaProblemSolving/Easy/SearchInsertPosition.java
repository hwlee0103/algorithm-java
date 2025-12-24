package JavaProblemSolving.Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : Easy
 * Title : 35. Search Insert Position
 * Topic : Array, Binary Search
 *
 * Started : 2025-12-15
 * Solved : 2025-12-
 * Time: -
 * Algorithm: Binary Search
 *
 *
 *
 */

public class SearchInsertPosition {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Easy";
        String currentClass = "SearchInsertPosition";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + (i + 1));
            String[] inputs = inputLines.get(i).split(" ");
            String[] arr = inputs[0].replaceAll("\\[", "").replaceAll("]", "").split(",");
            int target = Integer.parseInt(inputs[1]);

            System.out.println("nums: " + Arrays.toString(arr));
            System.out.println("target: " + target);
            System.out.println("--------------------------");
            int answer = searchInsert(Arrays.stream(arr).mapToInt(Integer::parseInt).toArray(), target);
            System.out.println("answer: " + answer);

            int output = Integer.valueOf(outputLines.get(i));
            System.out.print(" ==> ");
            if(answer == output) {
                System.out.println("Success!");
            } else {
                System.out.println("Failed!");
            }
            System.out.println("=========================");

        }
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
