package java_problemsolving.monthlycodechallenge.seasonthree.levelthree;

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
 * Solved : 2025-11-02
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
        // 파라메트릭 서치 - '최소 시간'
        long left = 0;
        long right = 1_000_000_000_000_000L;
        long answer = right;

        while(left <= right) {
            long mid = (left + right) / 2;
            // 금 옮기기 check
            boolean able = carryCheck(a, b, g, s, w, t, mid);
            if(able) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static boolean carryCheck(int a, int b, int[] g, int[] s, int[] w, int[] t, long T) {
        long totalGold = 0;
        long totalSilver = 0;
        long total = 0;
        long arrSize = g.length;

        for(int i = 0; i < arrSize; ++i) {
            long nowRound = T / (2 * t[i]);
            long nowRemain = T % (2 * t[i]);
            if(nowRemain >= t[i]) nowRound += 1;

            totalGold += Math.min(nowRound * w[i], g[i]);
            totalSilver += Math.min(nowRound * w[i], s[i]);
            total += Math.min(nowRound * w[i], g[i] + s[i]);
        }

        if(totalGold >= a && totalSilver >= b && total >= (a + b))
            return true;
        else return false;
    }
}
