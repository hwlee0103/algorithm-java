package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 2
 * Title : 택배 상자
 * 문제 유형 : 연습문제
 *
 * Started : 2024-11-08
 * Solved : 2024-11-08
 *
 *
 */
public class CourierBox {
    public int solution(int[] order) {
        int answer = 0;
        int sz = order.length;
        int idx = 1;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < sz; ++i) {
            if(idx > sz && !(!stack.empty() && stack.peek() == order[i])) break;
            if(order[i] != idx
                    && !(!stack.empty() && stack.peek() == order[i])) {
                stack.push(idx);
                idx++;
                i--;
            } else if(order[i] == idx) {
                idx++;
                answer++;
            } else if(!stack.empty() && stack.peek() == order[i]) {
                stack.pop();
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] order = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new CourierBox().solution(order));
    }
}
