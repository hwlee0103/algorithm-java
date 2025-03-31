package java_problemsolving.levelthree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Level : 3
 * Title : N으로 표현
 * 문제 유형 : 동적계획법 Dynamic Programming
 *
 * Started : 2025-03-28
 * Solved : 2025-
 *
 *
 */

public class NExpression {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("programmers/src/java_problemsolving/levelthree/NExpression_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/levelthree/NExpression_output.txt");

        List<String> inputList = Files.readAllLines(inputPath);
        List<String> outputList = Files.readAllLines(outputPath);

        for(int i = 0; i < inputList.size(); i++) {
            int answer = 0;


            if(answer == Integer.valueOf(outputList.get(i))) {
                System.out.println("Success !");
            } else {
                System.out.println("Fail !");
            }
        }
    }

    public static int dynamic(int n, int number) {
        int answer = 0;
        int[] dp = new int[number + 1];

        dp[0] = 0;
        for(int i = 1; i <= number; i++) {
            if(i == 1) {
                if(n == 1) dp[1] = 1;
                else dp[1] = 2; // n / n
            } else {
                for(int j = 1; j < i; j++) {
                    // 예외 조건 필요; n/n + n/n = 2 == (n + n)/n = 2 --> 이걸 어떻게 확인하지?
                    dp[i] = dp[number - j] + dp[j];
                }
            }
        }

        return answer;
    }
}
