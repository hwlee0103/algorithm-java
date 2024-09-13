package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 귤 고르기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-09-12
 * Solved : 2024-09-
 *
 */
public class SelectingTangerine {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        Arrays.sort(tangerine);

        int now = tangerine[tangerine.length-1];

        for(int i = tangerine.length - 1; i >= 0; --i) {
            if(k <= 0) break;
            if(now != tangerine[i]) {
                answer++;
                now = tangerine[i];
            }
            k--;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] tangerine = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n, tangerine));
    }
}
