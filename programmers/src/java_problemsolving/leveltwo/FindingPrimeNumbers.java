package java_problemsolving.leveltwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Level : 2
 * Title : 소수 찾기 FindingPrimeNumbers
 * 문제 유형 : 완전 탐색 Brute Force
 *
 * Started : 2025-10-20
 * Solved : 2025-10-23
 *
 *
 */

public class FindingPrimeNumbers {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("programmers/src/java_problemsolving/leveltwo/inputoutput/FindingPrimeNumbers_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/leveltwo/inputoutput/FindingPrimeNumbers_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        int idx = 0;
        for(String line: inputLines) {
            String numbers = line.replaceAll("\"", "");
            int answer = solution(numbers);

            System.out.println("Query No: " + String.valueOf(idx + 1));
            System.out.println("numbers: " + numbers);
            System.out.println("-------------");
            System.out.println("answer: " + answer);
            if(answer == Integer.parseInt(outputLines.get(idx))) {
                System.out.println("Success!");
            } else {
                System.out.println("Failed!");
            }
            System.out.println("=======================");
            idx++;
        }
    }

    public static int solution(String numbers) {
        // Set에 모든 가능한 숫자 조합 저장
        char[] arr = numbers.toCharArray();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        Set<Integer> num = new HashSet<>();

        // 길이 1~N인 모든 숫자 만들기 (백트래킹)
        dfs(arr, used, 0, 0, num);

        if(num.isEmpty()) return 0;
        int maxNum = 2;
        for(int v: num) maxNum = Math.max(maxNum, v);

        boolean[] isPrime = sieve(maxNum);

        int count = 0;
        for(int v : num) {
            if(v >= 2 && isPrime[v]) count++;
        }
        return count;
    }

    private static void dfs(char[] arr, boolean[] used, int depth, int cur, Set<Integer> out) {
        if(depth > 0) out.add(cur); // 길이 1~N 수집
        for(int i = 0; i < arr.length; i++) {
            if(used[i]) continue;
            if(i > 0 && arr[i] == arr[i-1] && !used[i-1]) continue; // 중복 자리수 skip

            used[i] = true;
            int next = cur * 10 + arr[i] - '0';
            dfs(arr, used, depth + 1, next, out);
            used[i] = false;
        }
    }

    private static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i*i <= n; i++) {
            if(!isPrime[i]) continue;
            for(int j = i*i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}
