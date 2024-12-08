package baekjoononline.stack.blue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : Blue 2
 * Title : 1874 스택 수열
 * 문제 유형 : 스택
 *
 * Started : 2024-12-06
 * Solved : 2024-12-06
 *
 *
 */
public class boj1874StackArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }

        Stack<Integer> stack = new Stack<Integer>();
        int now = 1;
        List<String> oper = new ArrayList<String>();

        for(int i=0; i<n; i++) {
            // now 는 오름차순
            if(arr[i] < now && (!stack.empty() && arr[i] < stack.peek())) {
                oper.clear();
                oper.add("NO");
                break;
            }
            if(stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(now);
                oper.add("+");
                now++;
                i--;
            } else if(!stack.isEmpty() && stack.peek() == arr[i]){
                stack.pop();
                oper.add("-");
            }
        }
        for(int i=0; i<oper.size(); i++) {
            System.out.println(oper.get(i));
        }

    }
}
