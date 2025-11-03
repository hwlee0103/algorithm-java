package Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : Easy
 * Title : 14. Longest Common Prefix
 * 문제 유형 : Array, String, Trie
 *
 * Started : 2025-11-03
 * Solved : 2025-11-03
 * Time: 13min 37sec
 * Algorithm: Binary Search 사용
 *
 *
 */

public class LongestCommonPrefix {
    public static void main(String[] args) throws IOException {
        String currentLevel = "Easy";
        String currentClass = "LongestCommonPrefix";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String query = inputLines.get(i).replaceAll("\"", "").replaceAll("]", "").replaceAll("\\[", "");
            String[] strs = query.split(",");
            System.out.println("strs: " + Arrays.toString(strs));
            String answer = longestCommonPrefix(strs);
            String output = outputLines.get(i).replaceAll("\"", "").replaceAll("]", "").replaceAll("\\[", "");
            System.out.println("-----------------");
            System.out.println("Answer: " + answer);
            System.out.print(" ==> ");
            if(answer.equals(output)){
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=======================");
        }
    }
    public static String longestCommonPrefix(String[] strs) {
        // LCP 알고리즘 - Binary Search
        int minLen = Integer.MAX_VALUE;
        for(String s: strs) minLen = Math.min(minLen, s.length());

        int left = 0;
        int right = minLen;
        while(left < right) {
            int mid = (left + right + 1) >>> 1;

            if(isSharedPrefix(strs, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return strs[0].substring(0, left);
    }

    private static boolean isSharedPrefix(String[] str, int len) {
        String prefix = str[0].substring(0, len);
        for(int i = 0; i < str.length; ++i) {
            if(!str[i].startsWith(prefix)) return false;
        }
        return true;
    }
}
