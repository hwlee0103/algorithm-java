package JavaProblemSolving.Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Level : Easy
 * Title : 70. Climbing Stairs
 * Topic : Math, Dynamic Programming, Memoization
 *
 * Started : 2026-01-07
 * Solved : 2026-01-
 * Time: -
 * Algorithm: DP, 완전탐색
 *
 *
 *
 */
// dynamic programming -> 경우의 수
// n = 1
// 1

// n = 2
// 1 + 1
// 2

// n = 3
// 1 + 1 + 1
// 1 + 2
// 2 + 1

// f(n) = f(n-1) + f(n-2)
// n-1번째에 + 1 칸씩 한 경우
// n-2번째에 + 2 칸씩 한 경우

public class ClimbingStairs {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Easy";
        String currentClass = "ClimbingStairs";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            int query = Integer.valueOf(inputLines.get(i));
            System.out.println("n = " + query);
            int answer = climbStairs(query);
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

    public static int climbStairs(int n) {
        int[] dp = new int[46];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public int func(int n, int[] dp) {
        if(n == 0)
            return 0;
        if(n == 1) return dp[1] = 1;
        if(n == 2) return dp[2] = 2;
        if(dp[n] != 0)
            return dp[n];
        return dp[n] = func(n-1, dp) + func(n-2, dp);
    }
}
