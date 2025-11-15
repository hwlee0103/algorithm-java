package JavaProblemSolving.Medium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : Medium
 * Title : 6. Zigzag Conversion
 * Topic : String
 *
 * Started : 2025-11-05
 * Solved : 2025-11-05
 * Time: 2 hrs 20 min 20 sec (이해하기까지)
 * Algorithm: Simulation 사용 -> 권장: 인덱스 계산 로직
 *
 *
 */

public class ZigzagConversion {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Medium";
        String currentClass = "ZigzagConversion";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] inputs = inputLines.get(i).split(" ");
            String s = inputs[0].replaceAll("\"", "");
            int numRows = Integer.parseInt(inputs[1]);
            System.out.println("s: " + s);
            System.out.println("numRows: " + numRows);
            System.out.println("-------------");
            String answer = convert(s, numRows);
            System.out.println("Answer: " + answer);
            System.out.print(" ==> ");
            String expected = outputLines.get(i).replaceAll("\"", "");
            if(expected.equals(answer)) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=====================");
        }
    }

    public static String convert3(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) return s;

        int n = s.length();
        int cycle = 2*numRows - 2;
        StringBuilder ans = new StringBuilder(n);

        for(int r = 0; r < numRows; ++r) {
            for(int i = r; i < n; i += cycle) {
                ans.append(s.charAt(i));
                int j = i + cycle - 2 * r; //
                if (r != 0 && r != numRows - 1 && j < n) {
                    ans.append(s.charAt(j));
                }
            }
        }
        return ans.toString();
    }

    public static String convert2(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; ++i) rows[i] = new StringBuilder();

        int r = 0, step = 1; // down: +1, up: -1
        for(int k = 0; k < s.length(); ++k) {
            rows[r].append(s.charAt(k));
            if(r == 0) step = 1;
            if(r == numRows - 1) step = -1;
            r += step;
        }

        StringBuilder ans = new StringBuilder(s.length());
        for(StringBuilder sb : rows) ans.append(sb);
        return ans.toString();
    }

    public static String convert(String s, int numRows) {
        // String[][] board[i][j]라고 할 때
        // 아래로: i증가
        // 대각선위로: i감소 -1 j증가 +1
        char[][] board = new char[numRows][1000];
        for(char[] row : board) Arrays.fill(row, ' ');

        int i = 0;
        int j = 0;
        int dir = 0; // 아래로  1: 대각선
        for(char a: s.toCharArray()) {
            if(dir == 0) {
                if(i < numRows)
                    board[i++][j] = a;
                else board[--i][++j] = a;
            } else {
                if(i > 0)
                    board[--i][++j] = a;
                else board[i][++j] = a;
            }
            if(i == numRows) {
                dir = 1;
                i--;
            } else if(i <= 0) {
                dir = 0;
                i++;
            }
        }

        String answer = "";
        for(int x = 0; x < numRows; ++x) {
            for(int y = 0; y < 1000; ++y) {
                System.out.print(board[x][y] + " ");
                if(board[x][y] != ' ') answer += String.valueOf(board[x][y]);
            }
            System.out.println();
        }
        return answer;
    }
}
