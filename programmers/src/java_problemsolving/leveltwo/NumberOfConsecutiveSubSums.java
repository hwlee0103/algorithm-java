package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Level : 2
 * Title : 연속 부분 수열 합의 개수
 * 문제 유형 : 연습문제
 *
 * Started : 2024-09-30
 * Solved : 2024-09-30
 *
 * 문제 유형: DP, 다시 풀어보기
 *
 *
 */
public class NumberOfConsecutiveSubSums {
    public static int solution(int[] elements) {
        Set<Integer> sums = new HashSet<>();

        for(int i = 1; i <= elements.length; ++i) { //길이
            for(int j = 0; j < elements.length; ++j) {
                int sum = 0;
                for(int k = 0; k < i; ++k) {
                    sum += elements[(j + k)%elements.length];
                }
                sums.add(sum);
            }
        }

        return sums.size();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] elements = Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(elements));
    }
}
