package baekjoononline.stack.blue;

import java.util.Scanner;
import java.util.Stack;

/**
 * Level : Blue 4
 * Title : 10773 제로 Zero That Out
 * 문제 유형 : 스택
 *
 * Started : 2024-12-05
 * Solved : 2024-12-05
 *
 *
 */

public class boj10773ZeroThatOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int[] arr = new int[k];
        for(int i=0; i<k; i++) {
            arr[i] = input.nextInt();
        }

        Stack<Integer> stack = new Stack<Integer>();
        Long answer = 0L;
        for(int i=0; i<k; i++) {
            if(arr[i] == 0) {
                answer -= stack.pop();
            } else {
                stack.push(arr[i]);
                answer += arr[i];
            }
        }
        System.out.println(answer);
    }
}
