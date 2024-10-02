package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 0
 * Title : 배열 만들기 6
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-08-25
 * Solved : 2024-08-25
 *
 *
 */
public class MakingArray6 {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < arr.length; ++i) {
            if(stk.empty()) {
                stk.push(arr[i]);
            } else if(stk.peek() == arr[i]) {
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
        }
        answer = new int[stk.size()];
        for(int i = stk.size() - 1; i >= 0; --i) {
            answer[i] = stk.pop();
        }

        if(answer.length == 0) {
            answer = new int[]{-1};
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray())));
    }
}
