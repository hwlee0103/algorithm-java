package JavaProblemSolving.Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * Level : Easy
 * Title : 20. Valid Parentheses
 * 문제 유형 : String, Stack
 *
 * Started : 2025-11-03
 * Solved : 2025-11-03
 * Time: 9 min 22 sec
 * Algorithm: Stack / ArrayDeque 사용
 *
 *
 */
public class ValidParentheses {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Easy";
        String currentClass = "ValidParentheses";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String s = inputLines.get(i).replaceAll("\"", "");
            System.out.println("s: " + s);
            System.out.println("----------");
            boolean answer = isValid(s);
            System.out.println("Answer: " + answer);
            if(String.valueOf(answer).equals(outputLines.get(i))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("==========================");
        }
    }

    public static boolean isValid(String s) {
        //Stack<Character> stack = new Stack<>();
        Deque<Character> stack = new ArrayDeque<>(s.length());
        for(int i = 0; i < s.length(); ++i) {
            char now = s.charAt(i);

            if(stack.isEmpty()) {
                stack.push(now);
            } else {
                if(now == '(' || now == '{' || now == '[') {
                    stack.push(now);
                } else {
                    if(isPair(stack.peek(), now)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()) return false;
        else return true;
    }

    private static boolean isPair(char a, char b) {
        if(a == '(' && b == ')') return true;
        if(a == '{' && b == '}') return true;
        if(a == '[' && b == ']') return true;
        return false;
    }
}
