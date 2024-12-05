package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 1
 * Title : 같은 숫자는 싫어
 * 문제 유형 : 스택/큐
 *
 * Started : 2024-12-05
 * Solved : 2024-12-05
 *
 *
 */

public class NoSameNumbers {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; ++i) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if(stack.peek() != arr[i]) stack.push(arr[i]);
            }
        }

        Stack<Integer> ansStack = new Stack<>();
        int n = stack.size();
        for(int i = 0; i < n; ++i) {
            ansStack.push(stack.pop());
        }
        answer = new int[ansStack.size()];
        for(int i = 0; i < n; ++i) {
            answer[i] = ansStack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(new NoSameNumbers().solution(arr)));
    }
}
