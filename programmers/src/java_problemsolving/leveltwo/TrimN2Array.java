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
// TODO: 메모리 초과 문제 해결 : DP? 방법 수정?
    // 시간초과& 런타임에러
public class TrimN2Array {
    public static long[] solution(int n, long left, long right) {
        long[] answer = new long[(int)(right - left + 1)];
//        int[][] matrix = new int[n+1][n+1];
        List<Long> list = new ArrayList<>();

        int cnt = 0;
        int idx = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(cnt >= left && cnt <= right) {
                    list.add((long)(Math.max(i, j)));
                    answer[idx++] = Math.max(i, j);
                }
                cnt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextInt(), input.nextLong(), input.nextLong())));
    }
}
