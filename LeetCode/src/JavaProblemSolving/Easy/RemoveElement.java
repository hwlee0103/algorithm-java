package JavaProblemSolving.Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : Easy
 * Title : 27. Remove Element
 * Topic : Array, Two Pointers
 *
 * Started : 2025-11-04
 * Solved : 2025-11-04
 * Time: 05 min 16 sec
 * Algorithm: Two Pointers, Simulation
 *
 *
 */
public class RemoveElement {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Easy";
        String currentClass = "RemoveElement";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] query = inputLines.get(i).split(" ");
            String[] s = query[0].replaceAll("\\[", "").replaceAll("]", "").split(",");
            int[] nums = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
            int val = Integer.valueOf(query[1]);
            int answer = removeElement(nums, val);
            int[] expectedNums = Arrays.stream((outputLines.get(i).replaceAll("\\[","").replaceAll("]", "").split(","))).mapToInt(Integer::parseInt).toArray();

            // todo - arrays can be returned in any order
            boolean flag = true;
            for(int j = 0; j < answer; ++j) {
                if(expectedNums[j] != nums[j]) {
                    flag = false;
                    break;
                } else flag = true;
            }

            System.out.println("nums: " + Arrays.toString(nums));
            System.out.println("val: " + val);
            System.out.println("expectedNums: " + Arrays.toString(expectedNums));
            System.out.println("------------------");

            System.out.println("answer: " + answer);
            System.out.print(" ==> ");
            if(flag && answer == expectedNums.length) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("============================");
        }
    }
    public static int removeElement(int[] nums, int val) {
        int write = 0;

        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] != val) {
                nums[write++] = nums[i];
            }
        }
        return write;
    }
}
