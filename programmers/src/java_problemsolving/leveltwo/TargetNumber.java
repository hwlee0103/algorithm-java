package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 타겟 넘버
 * 문제 유형 : 깊이/너비 우선 탐색(DFS/BFS)
 *
 * Started : 2024-11-14
 * Solved : 2024-11-19
 *
 *
 */
public class TargetNumber {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, target, 0, 0);

        return answer;
    }

    public int dfs(int[] numbers, int target, int nowIdx, int nowRes) {
        int cnt = 0;
        if(nowIdx == numbers.length) {
            if(nowRes == target) {
//                answer++;
                return 1;
            } else return 0;
        }
        cnt += dfs(numbers, target, nowIdx + 1, nowRes + numbers[nowIdx]);
        cnt += dfs(numbers, target, nowIdx + 1, nowRes - numbers[nowIdx]);
        return cnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int target = input.nextInt();
        System.out.println(new TargetNumber().solution(numbers, target));
    }
}
