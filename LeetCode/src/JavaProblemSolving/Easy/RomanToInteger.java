package JavaProblemSolving.Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Level : Easy
 * Title : 13. Roman to Integer
 * 문제 유형 : Hash Table, Math, String
 *
 * Started : 2025-11-03
 * Solved : 2025-11-03
 * Time: 31min 44sec
 *
 *
 */
public class RomanToInteger {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Easy";
        String currentClass = "RomanToInteger";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] inputs = inputLines.get(i).split(" ");
            String s = inputs[0].replaceAll("\"", "");
            System.out.println("s: " + s);
            int answer = romanToInt(s);
            System.out.println("---------------");
            System.out.println("answer: " + answer);
            System.out.print(" ==> ");
            if(answer == Integer.parseInt(outputLines.get(i))){
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=====================");
        }
    }

    public static int romanToInt(String s) {
        int prev = 0;
        int total = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            int val = getIntegerNum(s.charAt(i));
            if(val < prev) total -= val;
            else total += val;
            prev = val;
        }
        return total;
    }

    // 숫자 return
    public static int getIntegerNum(char symbol) {
        switch(symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default: throw new IllegalArgumentException("Invalid roman char: " + symbol);
        }
    }
}
