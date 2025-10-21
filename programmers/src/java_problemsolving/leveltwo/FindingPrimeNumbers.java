package java_problemsolving.leveltwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

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
        int[] nums = new int[numbers.length()];

        for(int i = 0; i < numbers.length(); i++) {
            nums[i] = numbers.charAt(i) - '0';
        }

        // 에라토스테네스의 체 (생성 가능한 최대 숫자 기준)
        int sz = numbers.length();
        int sizeN = 1;
        while(sz > 0) {
            sizeN *= 10;
            sizeN += 1;
        }

        boolean[] isPrime = new boolean[sizeN * 9 + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i * i <= isPrime.length; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= sizeN; j++) {
                    isPrime[j] = false;
                }
            }
        }

        // 순열 & 소수 판별
        // 모든 만들 수 있는 수의 경우의 수를 구해야 함
        // 어떻게..? 순열로 가능?
        // 


        return answer;
    }
}
