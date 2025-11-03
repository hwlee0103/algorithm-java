package Medium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Level : Medium
 * Title : 3. Longest Substring Without Repeating Characters
 * 문제 유형 : Hash Table, String, Sliding Window
 *
 * Started : 2025-11-03
 * Solved : 2025-11-03
 * Time: 14 min 39 sec
 * Algorithm: Sliding Window 사용
 *
 *
 */

public class LongestSubstring {
    public static void main(String[] args) throws IOException {
        String currentLevel = "Medium";
        String currentClass = "LongestSubstring";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String s = inputLines.get(i).replaceAll("\"", "");
            System.out.println("s: " + s);
            System.out.println("------------");
            int answer = lengthOfLongestSubstring(s);
            int answer2 = lengthOfLongestSubstring2(s);
            System.out.println("answer: " + answer);
            System.out.println("answer2: " + answer2);
            System.out.print(" ==> ");
            if(answer == answer2 && answer == Integer.valueOf(outputLines.get(i))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=======================");
        }
    }

    // solution 1
    public static int lengthOfLongestSubstring(String s) {
        // two-pointer
        // string- substring
        // string.contains로 포함여부 확인
        int r = 0;
        int l = 0;
        int len = 0;
        String sub = ""; // 현재 부분 문자열
        while(r < s.length() && l < s.length()) {
            sub = s.substring(r, l);
            //System.out.println("sub: " + sub);
            if(sub.contains(s.substring(l, l+1))) {
                r++;
            } else {
                l++;
            }
            len = Math.max(len, l-r);
        }
        return len;
    }

    // solution 2
    public static int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> lastIdxs = new HashMap<>();
        // two-pointer
        int left = 0;
        int right = 0;
        int ans = 0;
        for(right = 0; right < s.length(); ++right) {
            char now = s.charAt(right);
            if(lastIdxs.containsKey(now)) {
                left = Math.max(left, lastIdxs.get(now) + 1);
            }
            ans = Math.max(ans, right - left + 1);
            lastIdxs.put(now, right);
        }
        return ans;
    }
}
