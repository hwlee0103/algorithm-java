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
 * Solved : 2025-
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

            System.out.println("Query No: " + idx + 1);
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
        int answer = 0;
//        int[] nums = new int[numbers.length()];
//
//        for(int i = 0; i < numbers.length(); i++) {
//            nums[i] = numbers.charAt(i) - '0';
//        }

        // Set에 모든 가능한 숫자 조합 저장
        char[] arr = numbers.toCharArray();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        Set<Integer> num = new HashSet<>();

        // 길이 1~N인 모든 숫자 만들기 (백트래킹)
        dfs(arr, used, 0, 0, num); // todo: num 정상 반영 여부 확인

        if(num.isEmpty()) return 0;
        int maxNum = Collections.max(num);
        if(maxNum < 2) return 0;

        boolean[] isPrime = sieve(maxNum);

        int count = 0;
        for(int v : num) {
            if(v >= 2 && isPrime[v]) count++;
        }
        return count;
    }

    private static void dfs(char[] arr, boolean[] used, int depth, int cur, Set<Integer> out) {

    }

    private static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i*i <= n; i++) {
            if(isPrime[i]) continue;
            for(int j = i*i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}
