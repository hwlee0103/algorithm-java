package java_problemsolving.levelthree;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : 3
 * Title : 입국심사
 * 문제 유형 : 이분 탐색
 *
 * Started : 2025-01-15
 * Solved : 2025-01-16
 *
 *
 */

public class ImmigrationScreening {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);

        answer = binarySearch(n, times);

        return answer;
    }

    public long binarySearch(int n, int[] times) {
        long left = 0;
        long right = (long) times[times.length - 1] * n;
        long answer = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            long cnt = 0;
            for(int i = 0; i < times.length; i++) {
                cnt += mid / times[i]; // 시간동안 각 창구가 심사할 수 있는 인원
            }

            if(cnt >= n) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("programmers/src/java_problemsolving/levelthree/ImmigrationScreening_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/levelthree/ImmigrationScreening_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            String line = inputLines.get(i);
            String[] words = line.split(" \\[");
            int n = Integer.parseInt(words[0]);
            int[] times = Arrays.stream(words[1].replaceAll("]", "").split(", ")).mapToInt(Integer::parseInt).toArray();

            long answer = new ImmigrationScreening().solution(n, times);

            long expected = Long.parseLong(outputLines.get(i));

            // 출력
            System.out.println("Test Case #" + (i + 1) + ": ");
            System.out.println("input :");
            System.out.println(">> n: " + n);
            System.out.println(">> times: " + Arrays.toString(times));
            System.out.println("expected: " + expected + ", answer: " + answer);
            System.out.println("                     -----> " + ((expected != answer) ? "wrong" : "correct"));
            System.out.println("===================================");
        }
    }
}
