package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 0
 * Title : 빈 배열에 추가, 삭제하기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-08-23
 * Solved : 2024-08-23
 *
 *
 */
public class AddAndRemoveToEmptyArray {
    public static int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; ++i) {
            if(flag[i]) {
                for(int j = 0; j < arr[i]*2; ++j) {
                    stack.push(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; ++j) {
                    stack.pop();
                }
            }
        }

        answer = new int[stack.size()];

        for(int i = stack.size() - 1; i >= 0 ; --i) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        String[] str = input.nextLine().split(", ");
        boolean[] flag = new boolean[str.length];
        for(int i = 0; i < str.length; ++i) {
            flag[i] = Boolean.parseBoolean(str[i]);
        }
        System.out.println(Arrays.toString(solution(arr, flag)));
    }
}
