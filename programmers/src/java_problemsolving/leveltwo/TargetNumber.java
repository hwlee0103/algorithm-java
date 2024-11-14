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
        boolean[] check = new boolean[numbers.length];
        answer = func(numbers, target, 0, 0, check);

        return answer;
    }

    public int func(int[] numbers, int target, int nowIdx, int nowRes, boolean[] check) {
        int cnt = 0;
        if(nowIdx == numbers.length) {
            if(nowRes == target) {
                return 1;
            } else return 0;
        } else if(nowIdx > numbers.length) {
            return 0;
        }

        for(int i = 0; i < numbers.length; i++) {
            if(check[i]) continue;
            check[i] = true;
            cnt += func(numbers, target, nowIdx + 1, nowRes + numbers[i], check);
            check[i] = false;
            cnt += func(numbers, target, nowIdx + 1, nowRes - numbers[i], check);
//            check[i] = false;
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
