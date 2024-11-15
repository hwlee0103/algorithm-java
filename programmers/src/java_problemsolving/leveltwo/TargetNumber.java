package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 타겟 넘버
 * 문제 유형 : 깊이/너비 우선 탐색(DFS/BFS)
 *
 * Started : 2024-11-14
 * Solved : 2024-
 *
 *
 */
public class TargetNumber {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int[] check = new int[numbers.length];
        answer = func(numbers, target, 0, 0, check);

        return answer;
    }

    public int func(int[] numbers, int target, int nowIdx, int nowRes, int[] check) {
        int cnt = 0;
        if(nowIdx == numbers.length) {
            System.out.println(Arrays.toString(check));
            if(nowRes == target) {
                return 1;
            } else return 0;
        } else if(nowIdx > numbers.length) {
            return 0;
        }

        // TODO:
        // 모든 원소에 대해 +와 -를 노드로 생각하고 순서대로 탐색해나가야 함
        // + - 모두 이미 실행 했을 때 방문 횟수 2
        for(int i = 0; i < numbers.length; i++) {
            if(check[i] != 0) continue;
            check[i] = 1;
            cnt += func(numbers, target, nowIdx + 1, nowRes + numbers[i], check);
            check[i] = -1;
            cnt += func(numbers, target, nowIdx + 1, nowRes - numbers[i], check);
            check[i] = 2;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int target = input.nextInt();
        System.out.println(new TargetNumber().solution(numbers, target));
    }
}
