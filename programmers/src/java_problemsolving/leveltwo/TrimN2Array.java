package java_problemsolving.leveltwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 2
 * Title : n^2 배열 자르기
 * 문제 유형 : 월간 코드 챌린지 시즌 3
 *
 * Started : 2024-10-11
 * Solved : 2024-10-
 *
 *
 */
public class TrimN2Array {
    public static long[] solution(int n, long left, long right) {
        List<Long> list = new ArrayList<>();
        long x = 0;
        long y = 0;
        for(long i = left; i <= right; ++i) {
            x = (i/n) + 1;
            y = (i%n) + 1;
            list.add(Math.max(x, y));
        }

        return list.stream().mapToLong(l -> l).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextInt(), input.nextLong(), input.nextLong())));
    }
}
