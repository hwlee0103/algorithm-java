package Medium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Level : Medium
 * Title : 56. Merge Intervals
 * Topic : Array, Sorting
 *
 * Started : 2025-11-07
 * Solved : 2025-11-
 * Time: 22 min 14 sec -> 09 min 17 sec
 * Algorithm: Priority Queue 틀림 -> Array
 * 기출: C
 *
 *
 */

public class MergeIntervals {
    public static void main(String[] args) throws IOException {
        String currentLevel = "Medium";
        String currentClass = "MergeIntervals";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] inputs = inputLines.get(i).split("],\\[");
            int[][] intervals = new int[inputs.length][2];
            for(int j = 0; j < inputs.length; j++) {
                String[] interval = inputs[j].replaceAll("\\[", "").replaceAll("]", "").split(",");
                intervals[j][0] = Integer.parseInt(interval[0]);
                intervals[j][1] = Integer.parseInt(interval[1]);
            }
            System.out.println("intervals: " + Arrays.deepToString(intervals));
            System.out.println("---------------------");
            int[][] answer = merge(intervals);
            System.out.println("answer: " + Arrays.deepToString(answer));

            String[] outputs = outputLines.get(i).split("],\\[");
            int[][] expected = new int[outputs.length][2];
            for(int j = 0; j < outputs.length; j++) {
                String[] res = outputs[j].replaceAll("\\[", "").replaceAll("]", "").split(",");
                expected[j][0] = Integer.parseInt(res[0]);
                expected[j][1] = Integer.parseInt(res[1]);
            }

            System.out.println("expected: " + Arrays.deepToString(expected));
            System.out.print(" ==> ");
            if(Arrays.deepEquals(expected, answer)) {
                System.out.println("Success!");
            } else System.out.println("Failed!");

            System.out.println("========================");
        }
    }

    public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return new int[0][2];

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0].clone();

        for(int i = 1; i < intervals.length; ++i) {
            int[] next = intervals[i];
            if(next[0] <= cur[1]) {
                cur[1] = Math.max(cur[1], next[1]);
            } else {
                res.add(cur);
                cur = next.clone();
            }
        }
        res.add(cur);
        return res.toArray(new int[res.size()][]);
    }
}
