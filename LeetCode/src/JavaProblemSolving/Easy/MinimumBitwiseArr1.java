package JavaProblemSolving.Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Level : Easy
 * Title : 3314. Construct the Minimum Bitwise Array 1
 * Topic : Array, Bit Manipulation, Biweekly Contest 141
 *
 * Started : 2026-01-20
 * Solved : 2026-01-20
 * Time: -
 * Algorithm: Simulation
 *
 *
 */
public class MinimumBitwiseArr1 {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Easy";
        String currentClass = "MinimumBitwiseArr1";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel + "/input/" + currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel + "/output/" + currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++){
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] tmp = inputLines.get(i).split(",");
            List<Integer> nums = new ArrayList<>();
            for(String s : tmp){
                nums.add(Integer.parseInt(s.replaceAll("\\[", "").replaceAll("]", "")));
            }
            System.out.println("nums = " + nums);

            int[] answer = minBitwiseArray(nums);
            String[] output = outputLines.get(i).split(",");
            int[] expected = new int[nums.size()];
            for(int j = 0; j < nums.size(); j++){
                expected[j] = Integer.parseInt(output[j].replaceAll("\\[", "").replaceAll("]", ""));
            }
            System.out.println("-----------------");
            System.out.println("Answer: " + Arrays.toString(answer));
            System.out.print(" ==> ");
            if(Arrays.equals(answer, expected)){
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=======================");
        }
    }

    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for(int i = 0; i < nums.size(); ++i){
            for(int j = 1; j <= 1000; ++j) {
                if ((int) (j | (j + 1)) == nums.get(i)) {
                    ans[i] = j;
                    break;
                }
            }
            if(ans[i] == 0){
                ans[i] = -1;
            }
        }

        return ans;
    }
}
