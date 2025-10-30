package java_problemsolving.monthlycodechallenge.seasonthree.levelthree;

import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : 3
 * Title : 86053 금과 은 운반하기
 * 문제 유형 : 월간 코드 챌린지 시즌 3
 *
 * Started : 2025-10-30
 * Solved : 2025-
 *
 *
 */
public class TransportingGoldAndSilver {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("programmers/src/java_problemsolving/monthlycodechallenge/seasonthree/input/TransportingGoldAndSilver_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/monthlycodechallenge/seasonthree/output/TransportingGoldAndSilver_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int idx = 0; idx < inputLines.size(); idx++) {
            System.out.println("Query #" + (idx + 1));
            String query = inputLines.get(idx).replaceAll("\\[", "").replaceAll("]", "");
            String[] inputList = query.split(" ");
            int a = Integer.parseInt(inputList[0]);
            int b = Integer.parseInt(inputList[1]);
            int[] g = Arrays.stream(inputList[2].split(",")).mapToInt(Integer::parseInt).toArray();
            int[] s = Arrays.stream(inputList[3].split(",")).mapToInt(Integer::parseInt).toArray();
            int[] w = Arrays.stream(inputList[4].split(",")).mapToInt(Integer::parseInt).toArray();
            int[] t = Arrays.stream(inputList[5].split(",")).mapToInt(Integer::parseInt).toArray();

            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("g: " + Arrays.toString(g));
            System.out.println("s: " + Arrays.toString(s));
            System.out.println("w: " + Arrays.toString(w));
            System.out.println("t: " + Arrays.toString(t));

            long answer = solution(a, b, g, s, w, t);

            System.out.println("------------------");
            System.out.println("Answer: " + answer);
            System.out.print(" ==> ");
            if(answer == Long.valueOf(outputLines.get(idx))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("===========================");
        }


    }

    public static long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = -1;
        return answer;
    }
}
