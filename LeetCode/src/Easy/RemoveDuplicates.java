package Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Level : Easy
 * Title : 26. Remove Duplicates from Sorted Array
 * Topic : Array, Two Pointers
 *
 * Started : 2025-11-04
 * Solved : 2025-11-04
 * Time: 18 min 50 sec
 * Algorithm: Hash Map 사용 -> two-pointer
 * 때로는 간단하게 생각할 필요도 있다!
 *
 */
public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        String currentLevel = "Easy";
        String currentClass = "RemoveDuplicates";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));

            int answer = removeDuplicates();

        }
    }

    // solution 1
    public static int removeDuplicates(int[] nums) {
        int dupCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; ++i) {
            if(map.containsKey(nums[i])) {
                dupCount++;
            } else {
                map.put(nums[i], i);
                ans.add(nums[i]);
            }
        }
        for(int i = 0; i < ans.size(); ++i) nums[i] = ans.get(i);
        return ans.size();
    }

    // solution 2
    public static int removeDuplicates2(int[] nums) {
        int sz = nums.length;
        if(sz == 0) return 0;

        int writeIdx = 1;
        int prev = nums[0];

        for(int i = 1; i < sz; ++i) {
            int x = nums[i];
            if(x != prev) {
                nums[writeIdx++] = x;
                prev = x;
            }
        }

        return writeIdx;
    }
}
